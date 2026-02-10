
//Use o Math.random para gerar qualquer número aleatório e exiba esse número no console.

let numero = Math.random()

console.log(`O número gerado foi: ${numero}`)

//Use o Math.random para gerar um número inteiro entre 1 e 10 e exiba esse número no console.

let numeroInteiro = parseInt (Math.random() * 10 + 1 );

console.log(`O número gerado foi: ${numeroInteiro}`)

//Use o Math.random para gerar um número inteiro entre 1 e 1000 e exiba esse número no console.

let numeroInteiro2 = parseInt (Math.random() * 1000 + 1 );

console.log(`O número gerado foi: ${numeroInteiro2}`)

//Pergunte ao usuário quantos carros ele tem e em seguida apresente no alert utilizando operador ternário.

let entradaCarro = prompt("Quantos carros você tem?");
let numeroCarro = entradaCarro > 1 ? "carros" : "carro";

alert(`Você disse ter ${entradaCarro} ${numeroCarro}`);