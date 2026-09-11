class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre; 
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Este es su producto: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
