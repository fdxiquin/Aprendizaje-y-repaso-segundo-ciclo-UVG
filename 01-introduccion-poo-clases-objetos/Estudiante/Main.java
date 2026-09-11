public class Main{
    public static void main(String args[]){

        //dos estudiantes
        Estudiante e1 = new Estudiante("Fernando", 428492, "Ingeniería en Compu");
        Estudiante e2 = new Estudiante("Iris", 92832, "Licenciatura en Mate");

        //mostrar la información de ambos
        e1.presentarse();
        e2.presentarse();

        //cambiar la carrea de un estudiante
        e1.setCarrera("Ingeniería en TI");

        //mostar la información de ambos
        e1.presentarse();
        e2.presentarse();

    }
}