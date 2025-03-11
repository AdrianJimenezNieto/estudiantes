package modelo;

public class Estudiante {
  
  private String nombre;
  private int edad;
  private double nota;
  
  public Estudiante() {}

  public Estudiante(String nombre, int edad, double nota) {
    this.nombre = nombre;
    this.edad = edad;
    this.nota = nota;
  }

  // Getters y setters
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public double getNota() {
    return nota;
  }

  // Sobreescribo el metodo toString para imprimir estudiantes por pantalla
  @Override
  public String toString() {
    return "\t" + this.nombre + "\t\t|\t" + this.edad + "\t|\t" + String.format("%.2f", this.nota) + "\n";
  }
}
