package interfaces;

import modelo.Estudiante;

import java.util.Collection;

public interface Aula {
  // metodo para añadir estudiantes
  void addEstudiante(Estudiante estudiante);

  // Método para imprimir todos los estudiantes
  default public String imprimirCabecera() {
    return "\tNOMBRE\t\t|\tEDAD\t|\tNOTA\n----------------------------------------------------------------\n";
  }

  // metodo para imprimir por pantalla el aula al completo
  default public String imprimirAula(Collection<Estudiante> estudiantes) {
    String resultado = imprimirCabecera();
    for (Estudiante estudiante : estudiantes) {
      resultado = resultado + estudiante.toString();
    }
    resultado = resultado + "\n\n";
    return resultado;
  }

  // metodo para imprimir solo un estudiante
  default public String imprimirEstudiante(Estudiante estudiante) {
    return imprimirCabecera() + estudiante.toString();
  }

}
