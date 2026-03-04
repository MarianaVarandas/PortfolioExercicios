## 📚 ForumHub - API de Fórum de Discussão

O **ForumHub** é uma API REST robusta desenvolvida em Java com Spring Boot, projetada para gerenciar tópicos de discussão. O projeto simula o backend de um fórum, permitindo que usuários criem, visualizem, atualizem e excluam tópicos, garantindo a persistência dos dados em um banco de dados relacional.

O objetivo principal foi aplicar os conceitos de **Clean Code**, as melhores práticas do modelo **REST** e segurança em APIs, consolidando o aprendizado no programa Oracle Next Education (ONE).

### 🔨 Funcionalidades

- **CRUD Completo de Tópicos**: Gerenciamento total de postagens, incluindo título, mensagem, data de criação, status e autor.
- **Validações de Negócio**: Impede a criação de tópicos duplicados (mesmo título e mensagem) e garante que campos obrigatórios sejam preenchidos.
- **Persistência em Banco de Dados**: Todos os dados são salvos de forma permanente, permitindo consultas rápidas e organizadas.
- **Respostas HTTP Padronizadas**: Utilização correta dos códigos de status (201 Created, 204 No Content, 404 Not Found, etc.) e retorno de dados via DTOs.
- **Tratamento de Erros**: Implementação de lógica para lidar com recursos não encontrados ou dados inválidos de forma amigável.

### 🧠 O que eu aprendi

Neste projeto, aprofundei meus conhecimentos em:

- **Spring Boot 3 & REST API**:
  - Criação de controllers utilizando as anotações `@RestController`, `@PostMapping`, `@GetMapping`, `@PutMapping` e `@DeleteMapping`.
  - Uso de **DTOs (Data Transfer Objects)** com Records para garantir uma comunicação segura e eficiente entre o cliente e o servidor.
- **Spring Data JPA & Hibernate**:
  - Mapeamento objeto-relacional avançado e gerenciamento de transações no banco de dados.
  - Implementação de atualizações parciais de entidades (Dynamic Update).
- **Boas Práticas & Bean Validation**:
  - Uso de anotações como `@NotBlank` e `@Valid` para validar dados de entrada antes que cheguem à camada de serviço.
  - Separação clara de responsabilidades entre as camadas de Controller, Repository e Domain.
- **Manipulação de Dados**:
  - Formatação de datas e organização de listas de tópicos para exibição na API.

### 🛠️ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3** (Data JPA, Web, Validation)
- **MySQL/PostgreSQL** (Banco de Dados Relacional)
- **Maven** (Gerenciador de Dependências)
- **Hibernate** (ORM)

### 📂 Como Executar

1. Clone o repositório.
2. Certifique-se de ter um banco de dados configurado (MySQL ou PostgreSQL).
3. No arquivo `src/main/resources/application.properties`, ajuste as configurações de `url`, `username` e `password` do seu banco de dados.
4. Abra o projeto na sua IDE (IntelliJ IDEA recomendada).
5. Execute a classe principal `ForumhubApplication`.
6. Utilize ferramentas como **Postman** ou **Insomnia** para realizar as requisições aos endpoints da API.

---

Feito com 💜 por [Dayalu](https://github.com/MarianaVarandas) – Desenvolvedora em formação.

Me siga nas redes:

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mariana-varandas-7b912b82/)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/_dayalu/)