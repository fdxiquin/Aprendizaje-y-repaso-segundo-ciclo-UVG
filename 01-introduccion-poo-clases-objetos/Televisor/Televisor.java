public class Televisor {
    private String marca;
    private int tamañoPulgadas;
    private String resolucion;
    private int canal;
    private boolean encendido = false;

    public Televisor(String marca, int tamañoPulgadas, String resolucion, int canal) {
        this.marca = marca;
        this.tamañoPulgadas = tamañoPulgadas;
        this.resolucion = resolucion;
        this.canal = canal;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }

    public void cambiarCanal(int canal) {
        this.canal = canal;
    }

    public void mostrarInformacion() {
        System.out.println("Esta es la información de su televisor:");
        System.out.println("Marca: " + marca);
        System.out.println("Tamaño: " + tamañoPulgadas);
        System.out.println("Resolución: " + resolucion);
        System.out.println("Canal: " + canal);
        System.out.println("¿Encendido? " + encendido);
        System.out.println();
    }
}