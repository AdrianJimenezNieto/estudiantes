package clases;

public class Menu {
  // Por razones de que solo debe haber un menu en nuestro programa y para practicar,
  // implementaré el patron de diseño Singleton a esta clase
  
  public final static String[] TIPOS = {"principal", "array", "arraylist"};
  private static String tipo = TIPOS[0];

  private static Menu instancia;
  
  private Menu() {}

  public static Menu getInstancia() {
    if (instancia == null) {
      instancia = new Menu();
    }
    return instancia;
  }

  // Getters y setters
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String nuevoTipo) {
    tipo = nuevoTipo;
  }

  // Metodo para mostrar el menu por pantalla
  public void mostrarMenu() {
    if (tipo == TIPOS[0]) {
      System.out.println("==========================================");
      System.out.println("             \033[1mMENU PRINCIPAL");
      System.out.println("==========================================");
      System.out.println("1. Usar Array");
      System.out.println("2. Usar ArrayList");
      System.out.println("3. Salir\n\n");
    }
    else if (tipo == TIPOS[1]) {
      System.out.println("==========================================");
      System.out.println("                \033[1mMENU ARRAY");
      System.out.println("==========================================");
      System.out.println("1. Agregar estudiante");
      System.out.println("2. Ver todos los estudiantes");
      System.out.println("3. Volver al menu principal\n\n");
    }
    else if (tipo == TIPOS[2]) {
      System.out.println("==========================================");
      System.out.println("             \033[1mMENU ARRAYLIST");
      System.out.println("==========================================");
      System.out.println("1. Agregar estudiante");
      System.out.println("2. Ver estudiantes");
      System.out.println("3. Eliminar un estudiante por nombre");
      System.out.println("4. Buscar un estudiante por nombre");
      System.out.println("5. Volver al menu principal\n\n");
    }
  }
}
