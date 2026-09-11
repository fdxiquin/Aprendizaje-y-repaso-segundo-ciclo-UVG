public class Main {
    public static void main(String[] args) {

        //crear dos objetos Producto
        Producto p1 = new Producto("Carrito de carreras", 199.99);
        Producto p2 = new Producto("Telefono inteligente", 2199.99);

        //mostrar ambos productos
        p1.mostrar();
        p2.mostrar();

        //cambiar el precio de un producto con su setPrecio
        p1.setPrecio(450.00);

        //mostrar nuevamente ambos productos
        p1.mostrar();
        p2.mostrar();
        
        }
}

