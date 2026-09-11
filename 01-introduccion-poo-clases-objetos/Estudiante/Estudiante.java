public class Estudiante{

    //atributos
    private String nombre;
    private int carne;
    private String carrera;

    //constructor
    public Estudiante(String nombre, int carne, String carrera){
        this.nombre = nombre;
        this.carne = carne;
        this.carrera = carrera;
    }

    //métodos
    public void presentarse(){
        System.out.println("Hola mi nombre es " + nombre);
        System.out.println("Mi número de carne es " + carne);
        System.out.println("Estudio la carrera de  " + carrera);
        System.out.println();
    }

    public String getCarrera(){
        return carrera;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

}