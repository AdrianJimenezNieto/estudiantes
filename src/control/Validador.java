package control;

import excepciones.EntradaInvalidaException;

public class Validador {
  
  // Metodos para validar las entradas
  public static int leerEntero(String num) throws EntradaInvalidaException{
    // Método de validacion de un entero
    try {
      int numero = Integer.parseInt(num); // Intentamos convertir a entero

      if (numero < 18 || numero > 80) {
        throw new EntradaInvalidaException("La edad debe estar comprendida entre 18 y 80 años.");
      }

      return numero;
    } catch (NumberFormatException e) {
      throw new EntradaInvalidaException("La edad debe ser un entero.");
    }
  }

  public static double leerDouble(String num) throws EntradaInvalidaException {
    // Metodo para la validación de un double
    try {
      double numero = Double.parseDouble(num); // Intentamos convertir a double

      if (numero < 0 || numero > 10) {
        throw new EntradaInvalidaException("Recuerde que la nota debe estar entre 0.0 y 10,0.");
      }

      return numero;

    } catch (NumberFormatException e) {
      throw new EntradaInvalidaException("La nota debe ser un número decimal válido.");
    }
  }
}
