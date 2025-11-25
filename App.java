public class App {
    public static void main(String[] args) {

        Universidad u = new Universidad();

        Estudiante e1 = new Estudiante("Lucas");
        e1.agregarMateria(new Materia("Matemática", 8));
        e1.agregarMateria(new Materia("Programación", 10));

        Estudiante e2 = new Estudiante("Ana");
        e2.agregarMateria(new Materia("Matemática", 9));
        e2.agregarMateria(new Materia("Base de Datos", 7));

        Profesor p1 = new Profesor("Domínguez");
        p1.asignarMateria(new Materia("Programación", 0));

        u.agregarMiembro(e1);
        u.agregarMiembro(e2);
        u.agregarMiembro(p1);

        System.out.println("Listado recursivo:");
        u.listarRecursivo();

        System.out.println("\nPromedio recursivo de Lucas: " + e1.calcularPromedioRecursivo());
        System.out.println("Promedio iterativo de Lucas: " + e1.calcularPromedioIterativo());

        System.out.println("\nBuscando a 'Ana':");
        Persona encontrada = u.buscar("Ana");
        if (encontrada != null)
            System.out.println("Encontrada: " + encontrada.getNombre());
        else
            System.out.println("No encontrada.");
    }
}
