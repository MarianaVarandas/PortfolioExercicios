package com.alura.literalura.principal;

import com.alura.literalura.model.*;
import com.alura.literalura.repository.AutorRepository;
import com.alura.literalura.repository.LivroRepository;
import com.alura.literalura.service.ConsumoApi;
import com.alura.literalura.service.ConverteDados;

import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://gutendex.com/books/?search=";

    private LivroRepository livroRepository;
    private AutorRepository autorRepository;

    public Principal(LivroRepository livroRepository, AutorRepository autorRepository) {
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

    public void exibeMenu() {
        var opcao = -1;
        while (opcao != 0) {
            var menu = """
                    \n--------------------------------
                    1 - Buscar livro pelo título
                    2 - Listar livros registrados
                    3 - Listar autores registrados
                    4 - Listar autores vivos em um determinado ano
                    5 - Listar livros em um determinado idioma
                    0 - Sair
                    --------------------------------
                    """;

            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch (opcao) {
                case 1 -> buscarLivroWeb();
                case 2 -> listarLivrosRegistrados();
                case 3 -> listarAutoresRegistrados();
                case 4 -> listarAutoresVivos();
                case 5 -> listarLivrosPorIdioma();
                case 0 -> System.out.println("Até já!");
                default -> System.out.println("Opção inválida");
            }
        }
    }

    private void buscarLivroWeb() {
        System.out.println("Digite o nome do livro para busca:");
        var nomeLivro = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeLivro.replace(" ", "%20"));
        DadosGutendex dados = conversor.obterDados(json, DadosGutendex.class);

        if (dados.resultados() != null && !dados.resultados().isEmpty()) {
            DadosLivro dadosLivro = dados.resultados().get(0);
            DadosAutor dadosAutor = dadosLivro.autores().get(0);

            // Verificando se o autor já existe para não duplicar
            Autor autor = autorRepository.findByNome(dadosAutor.nome());
            if (autor == null) {
                autor = new Autor(dadosAutor);
                autorRepository.save(autor);
            }

            // vou salvar direto assumindo que o usuário não vai buscar o mesmo livro 2 vezes
            Livro livro = new Livro(dadosLivro, autor);
            livroRepository.save(livro);
            System.out.println("Livro salvo com sucesso!");
            System.out.println(livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    private void listarLivrosRegistrados() {
        List<Livro> livros = livroRepository.findAll();
        livros.forEach(System.out::println);
    }

    private void listarAutoresRegistrados() {
        List<Autor> autores = autorRepository.findAll();
        autores.forEach(System.out::println);
    }

    private void listarAutoresVivos() {
        System.out.println("Insira o ano que deseja pesquisar:");
        var ano = leitura.nextInt();
        List<Autor> autores = autorRepository.autoresVivosNoAno(ano);
        autores.forEach(System.out::println);
    }

    private void listarLivrosPorIdioma() {
        System.out.println("Insira o idioma para busca (es, en, fr, pt):");
        var idioma = leitura.nextLine();
        List<Livro> livros = livroRepository.findByIdioma(idioma);
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro encontrado nesse idioma.");
        } else {
            livros.forEach(System.out::println);
        }
    }
}
