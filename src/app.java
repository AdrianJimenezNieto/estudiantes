// Paquetes propios
import clases.*;

// Librerias
import java.util.Scanner;

public class app {
  // variables para el control del flujo del programa y la entrada de datos
  private static final Scanner SCANNER = new Scanner(System.in);
  private static boolean runApp = true;
  private static boolean runArray = false;
  private static boolean runArrayList = false;
  private static String input = "";

  public static void main(String[] args) {
    // Declaracion de variables
    Menu menu = Menu.getInstancia();
    
    while (runApp) {
      // Bucle para la ejecución global de la app
      menu.mostrarMenu();
      input = SCANNER.next();
      System.out.println("\n\n");
      if(input.equals("1")) {
        menu.setTipo("array");
        runArray = true;
        while (runArray) {
          // Mostramos menu y pedimos input
          menu.mostrarMenu();
          input = SCANNER.next();
          System.out.println("\n\n");
          if (input.equals("1")) {
            System.out.println("TODO: ingresar estudiante\n\n");
            
          } else if (input.equals("2")) {
            System.out.println("TODO: ver estudiantes\n\n");
            
          } else if (input.equals("3")) {
            // Cambiamos al menu principal y rompemos el bucle
            menu.setTipo("principal");
            runArray = false;
          }
        }
      } else if (input.equals("2")) {
        menu.setTipo("arraylist");
        runArrayList = true;
        while (runArrayList) {
          // Mostramos menu y pedimos input
          menu.mostrarMenu();
          input = SCANNER.next();
          System.out.println("\n\n");
          if (input.equals("1")) {
            System.out.println("TODO: ingresar estudiante\n\n");
            
          } else if (input.equals("2")) {
            System.out.println("TODO: ver estudiantes\n\n");
            
          } else if (input.equals("3")) {
            System.out.println("TODO: eliminar por nombre\n\n");
            
          } else if (input.equals("4")) {
            System.out.println("TODO: Buscar por nombre\n\n");

          } else if (input.equals("5")) {
            // Cambiamos al menu principal y rompemos el bucle
            menu.setTipo("principal");
            runArrayList = false;
          }
        }
      } else if (input.equals("3")) {
        System.out.println("==========================================");
        System.out.println("           \033[1mFIN DE LA EJECICIÓN");
        System.out.println("==========================================");
        runApp = false; // Finalizamos el bucle de ejecucion del programa
      }
    }
  }
}