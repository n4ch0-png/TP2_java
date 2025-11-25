public class Personal extends Persona {

    private String cargo;

    public Personal(String nombre, String cargo) {
        super(nombre);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
