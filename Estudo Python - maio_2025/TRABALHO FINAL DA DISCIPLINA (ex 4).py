# Enunciado: Você e sua equipe de programadores foram contratados por pequena empresa para desenvolver o software de gerenciamento de livros. Este software deve ter o seguinte menu e opções:
#Cadastrar Livro
#Consultar Livro
#Consultar Todos 
#Consultar por Id
#Consultar por Autor
#Retornar ao menu
#Remover Livro
#Encerrar Programa

#Elabore um programa em Python que: 
#Deve-se implementar o print com uma mensagem de boas-vindas que apareça o seu nome [EXIGÊNCIA DE CÓDIGO 1 de 8];
#Deve-se implementar uma lista vazia com o nome de lista_livro e a variável id_global com valor inicial igual a 0 [EXIGÊNCIA DE CÓDIGO 2 de 8];
#Deve-se implementar uma função chamada cadastrar_livro(id) em que: [EXIGÊNCIA DE CÓDIGO 3 de 8];
#Pergunta nome, autor, editora do livro;
#Armazena o id (este é fornecido via parâmetro da função), nome, autor, editora dentro de um dicionário;
#Copiar o dicionário para dentro da lista_livro;
#Deve-se implementar uma função chamada consultar_livro() em que: [EXIGÊNCIA DE CÓDIGO 4 de 8];
#Deve-se perguntar qual opção deseja (1. Consultar Todos / 2. Consultar por Id / 3. Consultar por Autor / 4. Retornar ao menu):
#Se Consultar Todos, apresentar todos os livros com todos os seus dados cadastrados;
#Se Consultar por Id, apresentar o livro específico com todos os seus dados cadastrados;
#Se Consultar por Autor, apresentar o(s) livro(s) do autor com todos os seus dados cadastrados;
#Se Retornar ao menu, deve-se retornar ao menu principal;
#Se Entrar com um valor diferente de 1, 2, 3 ou 4, printar “Opção inválida" e repetir a pergunta D.a.
#Enquanto o usuário não escolher a opção 4, o menu consultar livros deve se repetir.
#Deve-se implementar uma função chamada remover_livro() em que: [EXIGÊNCIA DE CÓDIGO 5 de 8];
#Deve-se pergunta pelo id do livro a ser removido;
#Remover o livro da lista_livro;
#Se o id fornecido não for de um livro da lista, printar “Id inválido” e repetir a pergunta E.a.
#Deve-se implementar uma estrutura de menu no código principal (main), ou seja, não pode estar dentro de função, em que: [EXIGÊNCIA DE CÓDIGO 6 de 8];
#Deve-se pergunta qual opção deseja (1. Cadastrar Livro / 2. Consultar Livro / 3. Remover Livro / 4. Encerrar Programa):
#Se Cadastrar Livro, acrescentar em um id_ global e chamar a função cadastrar_livro(id_ global);
#Se Consultar Livro, chamar função consultar_livro();
#Se Remover Livro, chamar função remover_livro();
#Se Encerrar Programa, sair do menu (e com isso acabar a execução do código);
#Se Entrar com um valor diferente de 1, 2, 3 ou 4, printar “Opção inválida" e repetir a pergunta F.a.
#Enquanto o usuário não escolher a opção 4, o menu deve se repetir.
#Deve-se implementar uma lista de dicionários (uma lista contento dicionários dentro) [EXIGÊNCIA DE CÓDIGO 7 de 8];
#Deve-se inserir comentários relevantes no código [EXIGÊNCIA DE CÓDIGO 8 de 8];
#Deve-se apresentar na saída de console uma mensagem de boas-vindas com o seu nome [EXIGÊNCIA DE SAÍDA DE CONSOLE 1 de 6];
#Deve-se apresentar na saída de console um cadastro de 3 livros (sendo 2 deles no mesmo autor) [EXIGÊNCIA DE SAÍDA DE CONSOLE 2 de 6];
#Deve-se apresentar na saída de console uma consulta de todos os livros [EXIGÊNCIA DE SAÍDA DE CONSOLE 3 de 6];
#Deve-se apresentar na saída de console uma consulta por código (id) de um dos livros [EXIGÊNCIA DE SAÍDA DE CONSOLE 4 de 6];
#Deve-se apresentar na saída de console uma consulta por autor em que 2 livros sejam do mesmo autor [EXIGÊNCIA DE SAÍDA DE CONSOLE 5 de 6];
#Deve-se apresentar na saída de console uma remoção de um dos livros seguida de uma consulta de todos os livros [EXIGÊNCIA DE SAÍDA DE CONSOLE 6 de 6];

print("Seja muito bem-vinda, Mariana Varandas\n")

# Lista para guardar os livros e variável global de ID
lista_livro = []
id_global = 0  # será incrementado a cada cadastro, gerando um ID único para cada cadastro

# Função para cadastrar livro
def cadastrar_livro(id):
    nome_livro = input("Digite o nome do livro: ")
    autor = input("Digite o nome do autor: ")
    editora = input("Digite o nome da editora: ")

    livro = {"id": id,"nome": nome_livro,"autor": autor,"editora": editora}

    lista_livro.append(livro)
    print(f"Livro '{nome_livro}' cadastrado com sucesso! ID: {id}\n")

# Função para consultar livros
def consultar_livro():
    while (True):
        print("\n** MENU DE CONSULTA **")
        print("1 - Consultar todos")
        print("2 - Consultar por ID")
        print("3 - Consultar por autor")
        print("4 - Retornar ao menu inicial\n")

        try:
            consulta = int(input("Digite o número da opção desejada: "))
        except ValueError:
            print("Opção inválida. Digite um número de 1 a 4.")
            continue

        if (consulta == 1):
            print("\nLista completa de livros:")
            for livro in lista_livro:
                print(livro)

        elif (consulta == 2):
            try:
                consulta_id = int(input("Digite o ID do livro: "))
            except ValueError:
                print("Valor inválido. ID deve ser um número inteiro.")
                continue

            encontrado = False
            for livro in lista_livro:
                if livro['id'] == consulta_id:
                    print("\nLivro encontrado:")
                    print(livro)
                    encontrado = True
                    break
            if (not encontrado):
                print("ID não encontrado.")

        elif (consulta == 3):
            consulta_autor = input("Digite o nome do autor desejado: ")
            resultado = [livro for livro in lista_livro if livro['autor'] == consulta_autor]

            if resultado:
                print(f"\nLivros do autor {consulta_autor}:")
                for livro in resultado:
                    print(livro)
            else:
                print("Autor não encontrado.")

        elif (consulta == 4):
            return  # volta ao menu principal

        else:
            print("Opção inválida. Tente novamente.")

# Função para remover livro
def remover_livro():
    while (True):
        try:
            remover_id = int(input("Digite o ID do livro que deseja remover: "))
        except ValueError:
            print("Valor inválido. ID deve ser um número inteiro.")
            continue

        for livro in lista_livro:
            if livro["id"] == remover_id:
                lista_livro.remove(livro)
                print(f"Livro com ID {remover_id} removido com sucesso!\n")
                return  # sai da função depois de remover

        print("ID não reconhecido. Tente novamente.")

# programa
while (True):
    print("\n** MENU PRINCIPAL **")
    print("1 - Cadastrar livro")
    print("2 - Consultar livro")
    print("3 - Remover livro")
    print("4 - Encerrar programa\n")

    try:
        opcao = int(input("Digite o número da opção escolhida: "))
    except ValueError:
        print("Opção inválida. Digite um número de 1 a 4.")
        continue

    if (opcao == 1):
        id_global += 1  # Incrementa ID global e gera um id novo
        cadastrar_livro(id_global)

    elif (opcao == 2):
        consultar_livro()

    elif (opcao == 3):
        remover_livro()

    elif (opcao == 4):
        print("Programa encerrado!")
        break

    else:
        print("Opção inválida. Tente novamente.")





