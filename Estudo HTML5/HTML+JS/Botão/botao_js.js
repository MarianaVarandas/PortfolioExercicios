let botao = document.querySelector ("#botao");
botao.style.background="blue"; 

let estaQuebrado=false;

botao.addEventListener("mouseover", trocaverde);
function trocaverde(){
    if (estaQuebrado===false)
    botao.style.background="green"; 
}

botao.addEventListener("mouseout", trocaazul);
function trocaazul(){
    if (estaQuebrado===false)
    botao.style.background="blue"; 
}

botao.addEventListener("click", trocavermelho);
function trocavermelho(){
    botao.style.background="red"; 
    botao.innerHTML= "QUEBREI!"
    estaQuebrado=true;
}