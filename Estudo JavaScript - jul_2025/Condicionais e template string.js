//Pergunte ao usuário qual é o dia da semana. Se a resposta for "Sábado" ou "Domingo", mostre "Bom fim de semana!". Caso contrário, mostre "Boa semana!".

let diaSemana = prompt("Que dia é hoje?");

if (diaSemana == "Sábado" || diaSemana == "Domingo"){
    alert("Bom final de semana!")
}   else{
    alert("Boa semana!")
}

//Verifique se um número digitado pelo usuário é positivo ou negativo. Mostre um alerta informando.

let numeroDigitado = prompt("Digite um número");

if (numeroDigitado > 0){
    alert("Este número é positivo!")
}   else{
    alert("Este número é negativo!")
}

//Crie uma mensagem que informa o usuário sobre o saldo da conta, usando uma template string para incluir o valor do saldo.

let saldoConta = "250.00";

alert(`O saldo da conta é de R$ ${saldoConta}`);

//Peça ao usuário para inserir seu nome usando prompt. Em seguida, mostre um alerta de boas-vindas usando esse nome

let nome = prompt ("Digite seu nome");

alert(`Olá, ${nome}!`);

//Crie um programa que utilize o console.log para exibir uma mensagem de boas-vindas.

console.log("Olá! Boas vindas!")


//Utilize o prompt e faça a seguinte pergunta: Qual a linguagem de programação que você mais gosta?. Em seguida, armazene a resposta em uma variável e mostre no console do navegador.

let = linguagemPreferida = prompt("Qual a linguagem de programação que você mais gosta?");
console.log(`Sua linguagem de programação preferida é ${linguagemPreferida}`);


//Crie uma variável chamada "valor1" e outra chamada "valor2", atribuindo a elas valores numéricos de sua escolha. Em seguida, realize a soma desses dois valores e armazene o resultado em uma terceira variável chamada "resultado". Utilize o console.log para mostrar a mensagem "A soma de [valor1] e [valor2] é igual a [resultado]." no console.

let valor1 = 30;
let valor2 = 20;
let resultado =  valor1 + valor2

console.log(`A soma de ${valor1} e ${valor2} é igual a ${resultado}.`)

//Peça ao usuário para inserir sua idade com prompt. Com base na idade inserida, utilize um if para verificar se a pessoa é maior ou menor de idade, exibindo uma mensagem apropriada no console.

let idade = prompt("Digite a sua idade");

if (idade < 18){
    console.log("Você é menor de idade");
    }else{
        console.log("Você é maior de idade");
    }

