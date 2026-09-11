public class Main {
    public static void main(String[] args) {
        Bombilla bombilla = new Bombilla("Escritorio", 9);

        //Estado inicial
        bombilla.mostrarEstado();

        //encender bombilla y estado
        bombilla.encender();
        bombilla.mostrarEstado();

        //apagar bombilla y estado
        bombilla.apagar();
        bombilla.mostrarEstado();

    }
}