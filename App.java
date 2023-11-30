import java.util.Scanner;

public class App {

    public static Scanner scApp = new Scanner(System.in);

    public static void main(String[] args) {
        // Creacion de un objeto de la clase mujer llamada "oMujer"
        Mujer oMujer1; // Declarar
        oMujer1 = new Mujer(); // Instanciar

        System.out.println("MUJER 1: ");
        // oMujer1.saludar(); // Invocar el metodo de saludar del obj.
        oMujer1.saludar();
        // oMujer1.Arreglos();
        // // -------------
        // System.out.println("MUJER 2: ");
        // oMujer2 = new Mujer();
        // oMujer2.nombre = "María";
        // oMujer2.saludar();
    }
}