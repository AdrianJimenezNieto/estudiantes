package control;

import java.util.Scanner;

import excepciones.EntradaInvalidaException;
import modelo.Estudiante;


public class ControlStreams {
  
  // metodo para pedir estudiantes
  public static Estudiante pedirEstudiante(Scanner s) {
    // validamos los datos a la vez que definimos las variables
    while(true) {
      System.out.print("NOMBRE:");
      String nombre = s.next();
      try {
        System.out.print("EDAD:");
        int edad = Validador.leerEntero(s.next());
        System.out.print("NOTA:");
        double nota = Validador.leerDouble(s.next());
  
        return new Estudiante(nombre, edad, nota);
      } catch(EntradaInvalidaException e) {
        System.out.println("Error: " + e.getMessage() + "Inténtalo de nuevo.\n\n");
      }
    }
  }

  // metodo para pedir el nombre de un estudiante
  public static String nombreEstudiante(Scanner s) {
    System.out.print("NOMBRE DEL ESTUDIANTE: ");
    return s.next();
  }
}
