package excepciones;

public class EntradaInvalidaException extends Exception {
  public EntradaInvalidaException(String mensaje) {
    super("\n\n" + mensaje);
  }
}
