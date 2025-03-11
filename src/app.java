// Paquetes propios
import menu.Menu;
import modelo.Estudiante;
import control.ControlStreams;
import aula.*;

// Librerias
import java.util.Scanner;


public class App {
  // variables para el control del flujo del programa y la entrada de datos
  private static final Scanner SCANNER = new Scanner(System.in);
  private static final Menu MENU = Menu.getInstancia();
  private static final AulaArray ARRAY = AulaArray.getInstancia();
  private static final AulaArrayList ARRAY_LIST = AulaArrayList.getInstancia();
  private static boolean runApp = true;
  private static boolean runArray = false;
  private static boolean runArrayList = false;
  private static String input = "";

  public static void main(String[] args) {
    // En el metodo main solo llamamos a una función
    iniciarApp();
  }

  private static boolean checkInput(String input, Menu.TipoMenu tipoMenu) {
    // método para ver si la entrada de teclado es buena
    if (tipoMenu == Menu.TipoMenu.PRINCIPAL) {
      if (input.equals("1") || input.equals("2") || input.equals("3")) {
        return true;
      }
    } else if(tipoMenu == Menu.TipoMenu.ARRAY) {
      if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5")) {
        return true;
      }
    } else if (tipoMenu == Menu.TipoMenu.ARRAYLIST) {
      if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6")) {
        return true;
      }
    }
    System.out.println("Por favor introduzca una opción válida.\n\n");
    return false;
  }

  // método para ejecutar el menu principal
  private static void iniciarApp() {
    while(runApp) {
      MENU.mostrarMenu();
      input = SCANNER.next();
      System.out.println("\n\n");
      if(checkInput(input, Menu.TipoMenu.PRINCIPAL)) {
        switch (input) {
          // 1. Cambiar al menú ARRAY con el método ejecutarMenuArray()
          case "1": ejecutarMenuArray(); break;
          // 2. Cambiar al menú ARRAYLIST con el método ejecutarMenuArrayList()
          case "2": ejecutarMenuArrayList(); break;
          // 3. Terminar la ejecución de la aplicacion
          case "3": salir(); break;
        }
      }
    }
  }

  // metodo para ejecutar el menu ARRAY
  private static void ejecutarMenuArray() {
    runArray = true;
    MENU.setTipo(Menu.TipoMenu.ARRAY);
    while(runArray) {
      MENU.mostrarMenu();
      input = SCANNER.next();
      System.out.println("\n\n");
      if (checkInput(input, Menu.TipoMenu.ARRAY)) {
        switch (input) {
          // 1. Cargar datos de prueba
          case "1": ARRAY.cargarPrueba(); break;
          // 2. Añadir estudiante a traves del metodo con el control
          case "2": ARRAY.addEstudiante(ControlStreams.pedirEstudiante(SCANNER)); break;
          // 3. Imprimir el array entero con el metodo toString()
          case "3": System.out.println(ARRAY); break;
          // 4. Volver al menú principal cambiando el boolean de control y el tipo de menu
          case "4": MENU.setTipo(Menu.TipoMenu.PRINCIPAL); runArray = false; break;
        }
      }
    }
  }

  // Metodo para ejecutar el menu de ARRAYLIST
  private static void ejecutarMenuArrayList() {
    MENU.setTipo(Menu.TipoMenu.ARRAYLIST);
    runArrayList = true;
    while (runArrayList) {
      MENU.mostrarMenu();
      input = SCANNER.next();
      System.out.println("\n\n");
      if(checkInput(input, Menu.TipoMenu.ARRAYLIST)) {
        switch (input) {
          // 1. Cargamos los datos de prueba con el metodo correspondiente
          case "1": ARRAY_LIST.cargarPrueba(); break;
          // 2. Utilizamos el metodo con la clase de control para añadir un estudiante
          case "2": ARRAY_LIST.addEstudiante(ControlStreams.pedirEstudiante(SCANNER)); break;
          //3. Imprimimos por pantalla la lista de estudiantes gracias a .toString()
          case "3": System.out.println(ARRAY_LIST); break;
          // 4. Utilizamos el ControlStreams para pedir un estudiante y eliminarlo
          case "4": ARRAY_LIST.eliminarEstudiante(ControlStreams.nombreEstudiante(SCANNER)); break;
          // 5. Utilizamos el metodo estático para buscar estudiantes y devolverlos por pantalla
          case "5": buscarEstudianteArrayList(); break;
          // 6. Cambiamos la variable de control de bucle a falso y volvemos al menu principal
          case "6": MENU.setTipo(Menu.TipoMenu.PRINCIPAL); runArrayList = false; break;
        }
      }
    }
  }

  // Método para buscar un estudiante en el array list
  private static void buscarEstudianteArrayList() {
    Estudiante estudiante = ARRAY_LIST.buscarEstudiante(ControlStreams.nombreEstudiante(SCANNER));
    if (estudiante != null) System.out.println(estudiante);
  }

  // Método para salir del programa
  private static void salir() {
    System.out.println("==========================================");
    System.out.println("           \033[1mFIN DE LA EJECICIÓN");
    System.out.println("==========================================");
    runApp = false; // Finalizamos el bucle de ejecucion del programa
    SCANNER.close(); // Cerramos la instancia de la clase Scanner
  }

}