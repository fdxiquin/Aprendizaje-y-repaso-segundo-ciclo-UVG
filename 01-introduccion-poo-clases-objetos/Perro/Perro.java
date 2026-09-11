public class Perro {
    private String nombre;
    private String raza;

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("Soy " + nombre + " ¡ Guaf Guaf !");
    }

    public void presentarse() {
        System.out.println("Me llamo " + nombre + " y soy de raza " + raza);
    }
}
