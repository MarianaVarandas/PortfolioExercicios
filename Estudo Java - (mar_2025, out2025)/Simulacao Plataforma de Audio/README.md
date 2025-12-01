# Projeto Java - Minhas Músicas (Desafio POO Alura)

Este projeto foi desenvolvido como parte da Formação Java e Orientação a Objetos da [Alura](https://www.alura.com.br/), dentro do programa [Oracle Next Education](https://www.oracle.com/br/education/oracle-next-education/) da Oracle. O objetivo principal é aplicar e demonstrar na prática os pilares fundamentais da Programação Orientada a Objetos (POO).

É um projeto de console, focado 100% na lógica de back-end e na estruturação de um sistema coeso e desacoplado.

## 🧠 Sobre o projeto

**Minhas Músicas** é um simulador de plataforma de áudio que roda inteiramente no console. Ele demonstra como estruturar um sistema que gerencia diferentes tipos de mídia (Músicas e Podcasts) e como eles podem ser classificados de formas distintas com base na interação do usuário (reproduções e curtidas).

## 🧩 Funcionalidades e Conceitos Aplicados

O núcleo do projeto é a demonstração dos conceitos de POO:

- **Herança:** Uma classe-pai `Audio` define atributos e comportamentos comuns (como `titulo`, `curtir()`, `reproduzir()`), que são herdados pelas classes-filhas `Musica` e `Podcast`.
- **Sobrescrita de Métodos (`@Override`):** Cada classe-filha implementa sua própria lógica para o método `getClassificacao()`.
    - `Musica` se classifica com base no **número de reproduções**.
    - `Podcast` se classifica com base no **número de curtidas**.
- **Polimorfismo:** A classe de serviço `MinhasPreferidas` possui um método `inclui(Audio audio)` que pode receber *qualquer* objeto do tipo `Audio` (seja `Musica` ou `Podcast`). Ela executa a lógica de classificação sem precisar saber qual é o tipo específico do objeto, apenas "confiando" no contrato estabelecido pela superclasse.
- **Separação de Responsabilidades:** O projeto separa claramente as classes de "Modelo" (que guardam dados, como `Musica`) da classe de "Serviço" (que executa ações, como `MinhasPreferidas`).

## 🚀 Como rodar o projeto

Como é um projeto Java de console, não há um link de deploy. Para executá-lo, você precisará ter o Java (JDK 17+) e uma IDE instalada.

1.  **Clonar o repositório:**
    ```bash
    git clone [https://github.com/MarianaVarandas/minhas-musicas.git](https://github.com/MarianaVarandas/minhas-musicas.git) 
    ``` 
    *(Observação: você precisará criar este repositório no seu GitHub e atualizar o link!)*

2.  **Abrir na sua IDE:**
    - Abra o projeto (ex: IntelliJ IDEA, Eclipse).
    - Certifique-se de que a pasta `src` (ou a pasta raiz do seu código) está marcada como "Sources Root" (pasta de código-fonte).

3.  **Localizar o arquivo principal:**
    - Navegue até `io.github.marianavarandas.minhasmusicas.principal.Main.java`

4.  **Executar (Run):**
    - Clique com o botão direito no arquivo `Main.java` e selecione "Run 'Main.main()'".
    - O resultado da simulação será exibido no console da sua IDE.

## 🧩 Tecnologias

- **Java 17+**
- **Programação Orientada a Objetos (POO)**
- **IntelliJ IDEA** 

---

Feito com 💜 por [Mariana Varandas](https://github.com/MarianaVarandas) – Desenvolvedora em formação.
Me siga nas redes:

[![LinkedIn](https://img.shields.io/badge/LinkedIn-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mariana-varandas-7b912b82/)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/_dayalu/)