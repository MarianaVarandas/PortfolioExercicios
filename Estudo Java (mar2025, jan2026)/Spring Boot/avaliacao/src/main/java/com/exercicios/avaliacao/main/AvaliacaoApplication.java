package com.exercicios.avaliacao.main;

import com.exercicios.avaliacao.classes.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AvaliacaoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Assinatura assinatura1 = new Assinatura("Netflix");
        Produto produto1 = new Produto("DVD");
        Produto produto2 = new Produto("Celular");
        Produto produto3 = new Produto("Maquina de Lavar");
        Servico servico1 = new Servico("Manutenção");

        Avaliacao<Assinatura> avaliacaoAssinatura1 = new Avaliacao<>(assinatura1, 8.5, "valeu a pena!");
        System.out.println(avaliacaoAssinatura1);

        Avaliacao<Produto> avaliacaP1 = new Avaliacao<>(produto1, 7, "podia ser melhor");
        Avaliacao<Produto> avaliacaP2 = new Avaliacao<>(produto2, 10, "amei!");
        Avaliacao<Produto> avaliacaP3 = new Avaliacao<>(produto1, 9.5, "lava bem, mas faz barulho");

        List<Avaliacao<Produto>> produtos = new ArrayList<>();
        produtos.add(avaliacaP1);
        produtos.add(avaliacaP2);
        produtos.add(avaliacaP3);

        CalculadoraDeMedias calculadora1 = new CalculadoraDeMedias();

        double CalculandoMediasProdutos = calculadora1.CalculaMedias(produtos);
        System.out.println("A media das avaliações de produtos é:" + CalculandoMediasProdutos);
    }
}
