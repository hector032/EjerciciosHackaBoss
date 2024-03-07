package Ejercicio1ReservaDeVuelos;

public class ReservaInvalidaException extends Exception {

    public ReservaInvalidaException() {
    }

    public ReservaInvalidaException(String message) {
        super(message);
    }
}
