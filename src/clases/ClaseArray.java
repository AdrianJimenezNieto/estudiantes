package clases;

public class ClaseArray {
  private Estudiante[] estudiantes;

  public ClaseArray(Estudiante[] estudiantes) {
    this.estudiantes = estudiantes;
  }

  //getters y setters
  public void setEstudiantes(Estudiante[] estudiantes) {
    this.estudiantes = estudiantes;
  }

  public Estudiante[] getEstudiantes() {
    return estudiantes;
  }
}
