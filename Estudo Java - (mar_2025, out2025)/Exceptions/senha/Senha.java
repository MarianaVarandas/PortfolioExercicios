package Exceptions.senha;

public class Senha {
    String numero;

    public Senha(String numero) {
        this.numero = numero;
        if(this.numero.length() < 8){
            throw new SenhaInvalidaException("A senha deve ter 8 digitos");
    }

    }

}
