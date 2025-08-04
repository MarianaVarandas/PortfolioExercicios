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