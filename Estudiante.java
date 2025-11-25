public class Estudiante extends Persona {

    private ListaEnlazada materias;

    public Estudiante(String nombre) {
        super(nombre);
        materias = new ListaEnlazada();
    }

    public void agregarMateria(Materia m) {
        materias.agregar(m);
    }

    /* ===== Promedio recursivo con nodos ===== */
    public double calcularPromedioRecursivo() {
        return calcularPromedioRecursivo(materias.getPrimero(), 0, 0);
    }

    private double calcularPromedioRecursivo(Nodo actual, int contador, double suma) {
        if (actual == null)
            return contador == 0 ? 0 : suma / contador;

        Materia m = (Materia) actual.dato;

        return calcularPromedioRecursivo(actual.siguiente, contador + 1, suma + m.getCalificacion());
    }

    /* ===== Promedio iterativo ===== */
    public double calcularPromedioIterativo() {
        Nodo actual = materias.getPrimero();
        double suma = 0;
        int contador = 0;

        while (actual != null) {
            Materia m = (Materia) actual.dato;
            suma += m.getCalificacion();
            contador++;
            actual = actual.siguiente;
        }

        return contador == 0 ? 0 : suma / contador;
    }
}
