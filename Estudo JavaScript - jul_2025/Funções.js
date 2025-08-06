//1. Criar uma função que exibe "Olá, mundo!" no console.

function helloWorld(){
    console.log("Olá, mundo!");
}

//2. Criar uma função que recebe um nome como parâmetro e exibe "Olá, [nome]!" no console.


function exibirNome(nome){
    console.log(`Olá, ${nome}`);
}

// 3. Criar uma função que recebe um número como parâmetro e retorna o dobro desse número.

function inputNumero(numero){
    let dobro = numero * 2;
    return dobro;
}

//4. Criar uma função que recebe três números como parâmetros e retorna a média deles.


function calculoMedia (num1, num2, num3){
    let media = (num1 + num2 + num3) /3;
    return media
}

//5. Criar uma função que recebe dois números como parâmetros e retorna o maior deles.

function numMaior (num1, num2) {

    if (num1 > num2){
        return num1;
    }else{
        return num2;
        }
    }
    // ou em operador ternário:

function numMaior (num1, num2) {
    return num1> num2 ? num1 : num2;
}


//6. Criar uma função que recebe um número como parâmetro e retorna o resultado da multiplicação desse número por ele mesmo

function calculoQuadrado (numero){
    let quadrado = numero * numero;
    return quadrado;
}

//7. Crie uma função que calcule o índice de massa corporal (IMC) de uma pessoa, a partir de sua altura, em metros, e peso, em quilogramas, que serão recebidos como parâmetro.

function calculoIMC (peso,altura){
    let imc = peso/(altura *altura)
    return imc
}

//8. Crie uma função que converte um valor em dólar, passado como parâmetro, e retorna o valor equivalente em reais. Para isso, considere a cotação do dólar igual a R$4,80.

function conversaoDolarReal (valorDolar) {
    let valorReal = valorDolar * 4.8
    return valorReal
}

//9. Crie uma função que mostre na tela a tabuada de um número dado como parâmetro.

function tabuada (numero){
    let multiplicador = 1;
    let multiplicacao
    
    while (multiplicador <= 10) {
        multiplicacao = numero * multiplicador
        console.log(`${numero} * ${multiplicador} = ${multiplicacao}`)
        multiplicador ++
    }
}

