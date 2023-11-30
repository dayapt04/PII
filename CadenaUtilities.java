public class CadenaUtilities {
    public static void main(String[] args) {
        byte ascii[] = { 71, 70, 71, 72, 73, 75 };
        char characters[] = { 'G', 'f', 'g' };

        String cad = new String(ascii);
        System.out.println("Cadena original: " + cad);

        String cad2 = new String(ascii, 2, 2); // GF GH IK
        System.out.println("Cadena con posicion y longitud: " + cad2);

        String cad3 = new String(characters);
        System.out.println("Cadena decaracteres: " + cad3);

        String str = new String(cad3);
        System.out.println("Cadena de cadena: " + str);

        System.out.println("\n>>> operaciones string");

        int len = str.length();
        System.out.println("Cadena: " + str);
        System.out.println("length() : Longitud de la cadena: " + len);

        Character c = str.charAt(1);
        String s = c.toString();
        System.out.println("charAt(): El carácter en el índice 1 es:. " + c);
        System.out.println("c.toString(): El carácter en el índice1 es:" + s);

        boolean b = str.equalsIgnoreCase("GFG");
        System.out.println("equalsIgnoreCase(): La cadena es igual a \"GFG\": " + b);

        str = str.concat(".abc");
        str = str.concat(".123");
        str = str.concat(".*-+");
        str = str.concat(".abc");

        String str1 = new String("hola");
        String str2 = new String("hola");
        String str3 = str1;

        if (str1 == str2)
            System.out.println("str1==str2, La referencia del objeto es la misma");
        else
            System.out.println("str1==str2, La referencia del objeto es diferente");

        if (str1 == str3)
            System.out.println("str1==str3, La referencia del objeto es la misma");
        else
            System.out.println("str1==str3, La referencia del objeto es diferente");

        str3 = "No te olvido... ";
        System.out.println("str1= " + str3);

        if (str1.equals(str2))
            System.out.println("str1.equals(str2): Los valores son los mismos");

        ///////////////
        // declara:
        String Sz;
        String Sn = new String();

        // for (;;) new String ("Te fregaste RAM");
        ///////////////
        String subStr123 = str.substring(8, 11); // Gfg.abc.123.*-+
        System.out.println("substring(): Substringdel índice 8 al 11: " + subStr123);

        String subStr1 = str.substring(4, str.length()); // abc.123.*-+ ....
        System.out.println("substring(): Subtring desde índice 4 hasta el final: " + subStr1);

        String subStr2 = str.replace('a', 'A');
        System.out.println("str.replace(): Reemplazando \'a\' por \'A\': " + subStr2);

        String subStr3 = str.toUpperCase();
        System.out.println("toUpperCase(): Convertir todos los carácteres a mayúsculas: " + subStr3);
        String subStr4 = str.toLowerCase();
        System.out.println("toLowerCase(): Convertir todos los carácteres a minusculas: " + subStr4);

        String strSplit[] = str.split("\\."); // gfg abc 123 *-+ abc
        // for (int i = 0; i < strSplit.length; i++)
        System.out.println("str.split(\".\"): dividir la cadena según el punto: " + str);

        for (String subS : strSplit)
            System.out.println(subS);

        System.out.println("str = " + str);
        for (char c1 : str.toCharArray()) {

            System.out.println(c1);
        }

        for (char c1 : "abcde".toCharArray()) {

            System.out.println(c1);
        }

        int a = 12;
        str = str + a;
        str = str.concat(String.valueOf(a));
        System.out.println("str= " + str);

        int indice123 = str.indexOf("123");
        System.out.println("indexOf(): Índice de la primera ocurrencia de \"123\": " + indice123);
        System.out.println("cadena a partir de 123 es: " + str.substring(indice123, str.length()));

        if (str.contains("x"))
            System.out.println("contain(x): La cadena contiene \"123\":" + true);
        else
            System.out.println("contain(x): La cadena no contiene \"123\":" + false);

        String nombre = "    Pepe Alimaña    ";
        nombre = nombre.trim();
        System.out.println("nombre es: " + nombre);
        // TipoDeclaracion();

    }

    private static void TipoDeclaracion() {
        // unmutable
        String name = "Geeks";
        String s = new String("Welcome");

        StringBuffer demoString = new StringBuffer("GeeokforGeeks");
        demoString = new StringBuffer();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GFG");
        stringBuilder.append("123.");
        stringBuilder.append("abc");

        name = name.concat("GFG");
        name = name.concat("123.");
        name = name.concat("abc");

        // Declaring Strings
        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");

        System.out.println(stringBuilder);
        System.out.println(name);
    }
}