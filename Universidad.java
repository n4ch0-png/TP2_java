public class Universidad {

    private ListaEnlazada miembros;

    public Universidad() {
        miembros = new ListaEnlazada();
    }

    public void agregarMiembro(Persona p) {
        miembros.agregar(p);
        miembros.ordenarPorNombre(); // inserción ordenada automática
    }

    /* ===== Listado recursivo ===== */
    public void listarRecursivo() {
        listarRecursivo(miembros.getPrimero());
    }

    private void listarRecursivo(Nodo actual) {
        if (actual == null) return;
        Persona p = (Persona) actual.dato;
        System.out.println(p.getNombre());
        listarRecursivo(actual.siguiente);
    }

    /* ===== Búsqueda binaria ===== */
    public Persona buscar(String nombre) {
        return miembros.busquedaBinariaPorNombre(nombre);
    }
}
