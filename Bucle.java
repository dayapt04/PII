public class Bucle {
    // propiedades
    // private int nroTerminos;

    // // constructor
    // public Bucle(int nroTerminos) {
    // this.nroTerminos = nroTerminos;
    // }

    // public void cicloRepetitivo() {
    // int incremento = 0;

    // // ciclo For
    // for (; incremento < this.nroTerminos; incremento += 3) {
    // System.out.println("Hola " + incremento);
    // }

    // // ciclo While
    // incremento = 0;
    // while (incremento < nroTerminos) {
    // System.out.println("While " + incremento++);
    // }

    // // ciclo doWhile
    // incremento = 0;
    // do {
    // System.out.println("do While " + incremento++);
    // } while (incremento < nroTerminos);

    // }

    // public void tipoDato() {

    // // Datos primitivos

    // char letra = 'a';
    // letra = 54;
    // short edad = 123;
    // int num = 321;
    // // long = 321 (int);
    // long numerolong = 321L;
    // float peso = 56.7f;
    // double precio = 98.45d;
    // boolean esMayorDeEdad = (1 == 2);
    // peso = (float) precio;
    // // Datos de objeto
    // String nombre = "123abc &//))&";
    // Integer numero = 5;
    // Float float1 = 321f;

    // nombre = float1.toString();
    // nombre = numero.toString();
    // nombre.charAt(1);
    // }
    public static void main(String[] args) {
        // Blucle oBluce =new Bucle(5);
        // Tipos de datos primitivos -> variables
        byte bin = 0;
        boolean ban = true;
        char c = 'a';
        c = 54;

        short edad = 9999;
        int i = 10;
        // cast (impli expli)
        long l = 10L;
        float f = 10.00000f;
        double d = 10.0000d;

        // Tipos de dato de referencia = propiedades
        String cadNum = "123a";
        Long ll = 23L;
        Integer I = 23;
        Double dbl = 23.0000;
        Float ff = 23.4f;
        Boolean b = true;
        Character ch = 'c';

        String[] arr = { "uno", "dos", "tres" };
        // List<Integrer> list = Arrays.asList(1,2,3,4,5);

        i = 5;
        // cast implicito
        i = i / 2; // 2.5
        f = i / 2;

        // cast explicito
        ll = (long) i;
        dbl = (double) ff;
        ff = (float) i;

        // convert
        i = Integer.parseInt(cadNum);
        ff = Float.parseFloat(cadNum);

        cadNum = I.toString();
        cadNum = ff.toString();

        // Tipos de Dato Objeto
        // Persona persona = new Persona("Juan", 23);
        // Mujer m = new Mujer();
    }
}
