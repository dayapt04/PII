import java.util.Scanner;

public class Mujer {
    Scanner sc = new Scanner(System.in);

    // Atributos de la clase mujer.
    public String nombre;
    private int edad;
    private double altura;
    public String clave;

    // Metodos
    // Constructor por defecto
    public Mujer() {
        nombre = "Ana";
        edad = 25;
        altura = 160;
        clave = "firu.321";
        System.out.println("Mi nombre de construcción es: " + nombre);
    }

    public void saludar() {
        System.out.println("Hola, soy una mujer y me llamo " + nombre);

        System.out.print("¿Cuál es es tu nombre? ");
        // String nombre = sc.nextLine();
        String nombre = App.scApp.nextLine();

        System.out.println("Bienvenido a mi casa: " + nombre);

        System.out.print("¿Cuál es tu edad? ");
        edad = sc.nextInt();
        System.out.println("Tu edad es: " + edad);

        // si edad es multiplo de 3
        int resto = edad % 3; // 21|_3_ 22|_3_
                              // -21 7 -21 7
                              // 0 (resto) SI 1 (resto) NO
        if (resto == 0) {
            System.out.println("Tu edad es un número múltiplo de 3");
        } else {
            System.out.println("No eres un número múltiplo de 3");
        }

        String sim[] = { "/", "|", "-", "\\", " " };
        for (int i = 0; i <= 100; i++) {
            String c = sim[i % 5];
            System.out.print("\r " + c);
        }

        // sc.close();
    }

    public void cantar() {
        System.out.println("Estoy cantando ahora...");
    }

    public void bailar() {
        System.out.println("Bailo con pasos elegantes y lindos movimientos.");
    }

    public void Arreglos() {
        // char palabra[] = { 'H', 'o', 'l', 'a' };
        int matriz[][] = { { 1, 2, 3 },
                { 1, 2, 3, 4, 4 },
                { 1, 2, 3, 4, 4, 5 },
                { 1, 2, 3 }
        };

        for (int[] is : matriz) {
            for (int n : is) {
                System.out.print(" " + n);
            }
            System.out.println("");
        }

        // while ((i<5) && (c = charAt() != EOF && (c != '\n')) ){}

    }
}