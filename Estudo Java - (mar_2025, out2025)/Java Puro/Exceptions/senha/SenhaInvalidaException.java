package Exceptions.senha;

public class SenhaInvalidaException extends RuntimeException {
    private String mensagem; // a mensagem que aparecerá quando rolar um catch

    public SenhaInvalidaException(String mensagem) { //construtor da exception
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}


