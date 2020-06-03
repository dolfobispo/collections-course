package one.digitalinnovation.exceptions;

public class OptionalException extends Exception {
    private final  String mensagem;
    public OptionalException(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
