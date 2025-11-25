public class Profesor extends Persona {

    private ListaEnlazada materiasAsignadas;

    public Profesor(String nombre) {
        super(nombre);
        materiasAsignadas = new ListaEnlazada();
    }

    public void asignarMateria(Materia m) {
        materiasAsignadas.agregar(m);
    }
}
