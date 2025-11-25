public class ListaEnlazada {
    private Nodo primero;

    public Nodo getPrimero() {
        return primero;
    }

    public void agregar(Object dato) {
        Nodo nuevo = new Nodo(dato);
        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo actual = primero;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public int contar() {
        int c = 0;
        Nodo actual = primero;
        while (actual != null) {
            c++;
            actual = actual.siguiente;
        }
        return c;
    }

    /* ===== Convertir lista → array ===== */
    public Object[] convertirAArray() {
        int tamaño = contar();
        Object[] array = new Object[tamaño];

        Nodo actual = primero;
        int i = 0;
        while (actual != null) {
            array[i] = actual.dato;
            actual = actual.siguiente;
            i++;
        }
        return array;
    }

    /* ===== Convertir array → lista ===== */
    public static ListaEnlazada convertirArrayALista(Object[] array) {
        ListaEnlazada lista = new ListaEnlazada();
        for (int i = 0; i < array.length; i++) {
            lista.agregar(array[i]);
        }
        return lista;
    }

    /* ===== Ordenamiento por nombre (Selection Sort) ===== */
    public void ordenarPorNombre() {
        Object[] arr = convertirAArray();

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                Persona p1 = (Persona) arr[j];
                Persona p2 = (Persona) arr[min];
                if (p1.getNombre().compareToIgnoreCase(p2.getNombre()) < 0) {
                    min = j;
                }
            }
            Object temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        ListaEnlazada nueva = convertirArrayALista(arr);
        this.primero = nueva.primero;
    }

    /* ===== Búsqueda binaria (requiere array) ===== */
    public Persona busquedaBinariaPorNombre(String nombre) {
        Object[] arr = convertirAArray();

        int inicio = 0, fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            Persona p = (Persona) arr[medio];

            int cmp = nombre.compareToIgnoreCase(p.getNombre());

            if (cmp == 0) return p;
            if (cmp < 0) fin = medio - 1;
            else inicio = medio + 1;
        }
        return null;
    }
}
