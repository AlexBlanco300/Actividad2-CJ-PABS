// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Calculo {
    public static double promedio = 0;
    public static String calificacion = "";

    public static double calPromedio( int[] calificaciones ){
        double suma = 0;
        int califLenght = calificaciones.length;

        for (int i = 0; i < califLenght; i++) {
            suma += calificaciones[i];
        }
        promedio = suma/califLenght;
        return promedio;
    }
    static public String calCalificacion(){
        if (promedio <= 50){
            calificacion = "F";
        } else if (promedio >=51 && promedio <= 60){
            calificacion = "E";
        } else if (promedio >=61 && promedio <= 70){
            calificacion = "D";
        }else if (promedio >=71 && promedio <= 80){
            calificacion = "C";
        }else if (promedio >=81 && promedio <= 90){
            calificacion = "B";
        } else if (promedio >=91 && promedio <= 100){
            calificacion = "A";
        }
        return calificacion;
    }
    public static void calResultado(String nombre, double promedio, int[] calificaciones){

        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación "+ (i+1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }
}

public class Main {
    public static void main(String[] args) {

        Calculo miInstancia = new Calculo();

        String nombre = "Alex";
        int[] calificaciones = {91,83,65,98,72};
        double promedio = Calculo.calPromedio(calificaciones);
        String calificacion = Calculo.calCalificacion();

        Calculo.calResultado(nombre,promedio,calificaciones);
    }
}