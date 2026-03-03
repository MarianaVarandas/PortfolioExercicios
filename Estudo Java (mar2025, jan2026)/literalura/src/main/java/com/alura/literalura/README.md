## 📚 LiterAlura - Catálogo de Livros

Aplicação de linha de comando desenvolvida em Java com Spring Boot que consome a API **Gutendex** para criar e gerenciar um catálogo de livros e autores, persistindo os dados em um banco de dados relacional **PostgreSQL**.

O objetivo principal foi consolidar conhecimentos sobre persistência de dados, relacionamentos entre entidades (JPA) e construção de consultas complexas em SQL através do Java.

### 🔨 Funcionalidades

- **Menu Interativo**: O usuário interage via terminal escolhendo entre buscar novos livros ou consultar os dados já salvos.
- **Busca e Persistência**: Ao buscar um livro pelo título, a aplicação consulta a API externa e, se encontrado, salva automaticamente o livro e o autor no banco de dados (evitando duplicidade de autores).
- **Listagem de Registros**: Exibe todos os livros e autores que já foram cadastrados no sistema.
- **Filtro de Autores Vivos**: Permite consultar quais autores estavam vivos em um determinado ano (cruzando data de nascimento e falecimento no banco).
- **Filtro por Idioma**: Lista os livros disponíveis em um idioma específico (português, inglês, francês, etc.).

### 🧠 O que eu aprendi

Neste projeto, aprofundei meus conhecimentos em:

- **Spring Data JPA & Hibernate**:
  - Mapeamento de Entidades (`@Entity`, `@Table`) e Relacionamentos (`@OneToMany`, `@ManyToOne`).
  - Criação de interfaces `Repository` para abstrair o acesso a dados.
  - Uso de **Derived Queries** (ex: `findByIdioma`) e **JPQL** (`@Query`) para consultas personalizadas no banco.
- **PostgreSQL & Integração**:
  - Configuração do driver do banco de dados no arquivo `application.properties`.
  - Conexão real com um banco de dados local para persistência permanente das informações.
- **Consumo de API & Tratamento de Dados**:
  - Conversão de dados da API (Records/DTOs) para Entidades do banco.
  - Tratamento de resultados nulos e listas vazias vindas da API usando `Optional`.
- **Java Streams**:
  - Ordenação e filtragem de listas para exibição organizada no console.

### 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (Data JPA, Web)
- **PostgreSQL** (Banco de Dados)
- **Maven**
- **Jackson Databind**
- **API Gutendex** (https://gutendex.com/)

### 📂 Como Executar

1. Clone o repositório.
2. Crie um banco de dados no PostgreSQL com o nome `literalura`.
3. No arquivo `src/main/resources/application.properties`, configure seu usuário e senha do banco.
4. Abra o projeto na sua IDE de preferência (gosto do IntelliJ).
5. Execute a classe principal `LiteraluraApplication`.
6. Siga as instruções no console para buscar livros e popular seu banco de dados.

---

Feito com 💜 por [Dayalu](https://github.com/MarianaVarandas) – Desenvolvedora em formação.

Me siga nas redes:

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mariana-varandas-7b912b82/)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/_dayalu/)

