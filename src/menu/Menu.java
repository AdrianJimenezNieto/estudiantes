package menu;

public class Menu {
  // Por razones de que solo debe haber un menu en nuestro programa y para practicar,
  // implementaré el patron de diseño Singleton a esta clase
  
  public enum TipoMenu { PRINCIPAL, ARRAY, ARRAYLIST};
  private static TipoMenu tipo = TipoMenu.PRINCIPAL;

  private static Menu instancia;
  
  private Menu() {}

  public static Menu getInstancia() {
    if (instancia == null) {
      instancia = new Menu();
    }
    return instancia;
  }

  // Getters y setters
  public TipoMenu getTipo() {
    return tipo;
  }

  public void setTipo(TipoMenu nuevoTipo) {
    tipo = nuevoTipo;
  }

  // Metodo para mostrar el menu por pantalla
  public void mostrarMenu() {
    if (tipo == TipoMenu.PRINCIPAL) {
      System.out.println("==========================================");
      System.out.println("             \033[1mMENU PRINCIPAL");
      System.out.println("==========================================");
      System.out.println("1. Usar Array");
      System.out.println("2. Usar ArrayList");
      System.out.println("3. Salir\n\n");
    }
    else if (tipo == TipoMenu.ARRAY) {
      System.out.println("==========================================");
      System.out.println("                \033[1mMENU ARRAY");
      System.out.println("==========================================");
      System.out.println("1. Cargar datos predefinidos para probar");
      System.out.println("2. Agregar estudiante");
      System.out.println("3. Ver todos los estudiantes");
      System.out.println("4. Volver al menu principal\n\n");
    }
    else if (tipo == TipoMenu.ARRAYLIST) {
      System.out.println("==========================================");
      System.out.println("             \033[1mMENU ARRAYLIST");
      System.out.println("==========================================");
      System.out.println("1. Cargar datos predefinidos para pruebas");
      System.out.println("2. Agregar estudiante");
      System.out.println("3. Ver estudiantes");
      System.out.println("4. Eliminar un estudiante por nombre");
      System.out.println("5. Buscar un estudiante por nombre");
      System.out.println("6. Volver al menu principal\n\n");
    }
  }
}
