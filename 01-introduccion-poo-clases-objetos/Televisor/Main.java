public class Main {
    public static void main(String[] args) {
        
        //crear dos televisores
        Televisor tv1 = new Televisor("LG", 75, "FULL HD", 102);
        Televisor tv2 = new Televisor("Samsung", 45, "HD", 202);
        
        //encender los dos televisores
        tv1.encender();
        tv2.encender();

        //cambiar el canal de una televisión
        tv1.cambiarCanal(115);

        // TODO: apaga la otra televisión.
        tv2.apagar();

        //muestra la informacion de ambos.
        tv1.mostrarInformacion();
        tv2.mostrarInformacion();
    
    }
}