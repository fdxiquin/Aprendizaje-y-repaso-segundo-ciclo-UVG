public class Bombilla {
    private String ubicacion;
    private int consumoWatts;
    private boolean encendida = false;

    public Bombilla(String ubicacion, int consumoWatts) {
        this.ubicacion = ubicacion;
        this.consumoWatts = consumoWatts;
    }

    public void encender() {
        encendida = true;
    }

    public void apagar() {
        encendida = false;
    }

    public void mostrarEstado() {
        System.out.println("Bombilla con ubicación en: " + ubicacion);
        System.out.println("Bombilla con consumo de " + consumoWatts + " watts");
        System.out.println("¿La bombilla está encendida?: " + encendida);
        System.out.println();
    }
}