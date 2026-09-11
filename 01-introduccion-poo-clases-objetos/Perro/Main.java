public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Tutis", "Cocker");
        Perro miPerrito = new Perro("Solo-vina", "Toledo");

        miPerro.ladrar();
        miPerro.presentarse();

        miPerrito.ladrar();
        miPerrito.presentarse();

    }
}

