

let titulo = document.querySelector ("h1");
titulo.innerHTML ("Hora do Desafio");

function cliqueConsole() {
    console.log ("O botão foi clicado")
}

function cliqueAlert()  {
    console.log ("Eu amo JS");
}

function cliquePrompt() {
    cidade = prompt ("Escreva o nome de uma cidade do Brasil")
    alert(`Estive em ${cidade} e lembrei de você`)
}

function cliqueSoma() {
    num1 = parseInt(prompt ("Digite um número inteiro"));
    num2 = parseInt(prompt ("Digite outro número inteiro"));
    soma = num1 + num2
    alert (`A soma de ${num1} e ${num2} é igual a ${soma}`)
}