# ARCHIVOS CLASES

## Clase 1

### IDE: Entorno de desarrollo integrado

1. Instalar jdk.
2. Instalar gitbash
3. Instalar Vscode
4. Crear un repositorio en github (<https://github.com/new>)
5. Jugar - mecanografía
6. Extensiones para VSCODE
7. Consola terminal

## Clase 2

* Shortcuts VSCODE

1. Ctrl + Shift + P -> Abrir el menú de comandos en la barra lateral. (Command Palette)
2. Ctrl + Ñ -> Abrir una nueva terminal.
3. Ctrl + D -> Sirve para seleccionar palabras repetidas cuando colocamos el cursor encima (Selector múltiple).
4. Ctrl + F2 -> Reemplazo de palabra en todo el documento.
5. Alt + Shift + Mouse -> Permite hacer un corte matricial, para seleccionar únicamente una parte de lo seleccionado.
6. Shift + Alt + Up or Shift + Alt + Down -> Permite copiar una linea hacia arriba o abajo.
7. Shift + Alt + A -> (Multi-line comment), Ctrl + K + C (Single-line comment).
8. Ctrl + K + U -> Descomentar una linea.
9. Ctrl + / -> Comentar una línea.
10. Ctrl + Space -> Lanza el asistente o editor al escribir.
11. Ctrl + X -> Borrar la linea seleccionada.
12. Shift + Ctrl + N -> Crear una nueva ventana del editor.
13. Ctrl + TAB -> Cambiar entre las pestañas abiertas.
14. Ctrl + W -> Cerrar la pestaña actual.

* Markdown
//TITULOS
<!-- 
# titulo 1
## titulo 2
### titulo 3
#### titulo 4
##### titulo 5 
-->
***
//IMAGENES
[google](URL)
![imagen](ruta/de/la/imagen)
//Formato letra
<!-- 
**negrita**
__negrita__
***Negrita y cursiva***
___Negrita y cursiva___ 
-->

***
//CODIGO
lenguaje
_Codigo aqui_

## Clase 3

### GIT

* Git fue creado en 2005 por Luis Torvalds (creador de Linux) como herramiento para acilitar el desrrollo colaborativo de software. Desde entonces han surgido incluso populares plataformas, como GitHub o GitLab, que permiten su uso online.
* Ayuda a trabajar colaborativamete.
* Se encarga de que el trabajo se integra en la nube.
* Es un sistema para controlar versiones, es decir, guardar los cambios realizados en nuestro proyecto.
* Es un sistema para controlar versiones de archivos.

### Comandos uso de GIT

1. git --version
2. git config --global user.name "Your Name"  
3. git cofig --global user.email "<youremail@domain.com>"
4. git init
    commit   c1    c3
------|------|-----|----- (abrir dimensión en el tiempo para guardar)
5. git status
6. git add . (para agregar todos los archivos)
---- (On branch master)
7. git add NombreCarpeta/NombreArchivo
8. git add <file.txt>
9. git rm <file.txt> (remover)

---- Inicio del control de versiones - clonado
10. git clone <URL del repositorio>
11. git clone <URL del repositorio> miNombre

### Linux

1. clear
2. ctrl + l     (arrow up) (tab: autocomplete)
3. cd /home/usuario/proyecto_git (ingresar a los directorios)
4. ls          (listar carpetas o archivos)
5. pwd  (direccion actual)
6. cat (ver contenido del archivo)
7. echo "hola mundo" > nombrearchivo.txt (crea txt con texto)
8. rm nombrearchivo.txt (eliminar archivo)
9. touch  (crear el archivo)

$ git add .gitignore
$ git commit -m "C2 add .gitignore"
                C1           C2
----<><><...>---|---------<>-|-- (On branch master)
              33b0cab      3a8e031

## Clase 4

### branch + merge

----<><><....>---|---              (main)-----< (req / fix)
                 |                   ^
                 |       C1          |
                 |---<><>|--...------|*(Config)
                        759e31a

### Linux (continuación)

1. git branch -m main (renombrar rama)
2. git branch (nombre de la rama para crear)
3. git checkout main (cambiar a la rama principal)
4. git log (historial de commits)
5. git switch (nombre de la rama) -para cambiar la rama en la que estoy.
6. git merge (para combinar dos ramas)

## Clase 5

### Introducción a Java

El nombre de la clase, representa al programa.
Public: para todos. Tiene acceso público, dos clases se pueden visualizar.
Protected: solo amigos, (seleccionadas clases pueden ver a la clase)
Private : solo yo, ese objeto solo puede interactuar consigo mismo.
El compilador solo corre el programa si es que la clase es pública. Solo allí lanza el programa a la memoria.

* Lo primero que hay que colocar dentro de una clase es el main.
* El main es el bloque de código a correr.
* Es un segmento que se pone en cualquier clase para arrancar el sistema. (Punto de inicio)
**Propiedad/atributo**
* Característica: lo que se puede ver de la variable
* Las características pasan a ser propiedades a definir.
Ejemplo:
protected short edad;
public string ColorOjos;
**Métodos**
Public void comer(){…}
Protected void cantar(String TipoCancion, int tiempo)

_GUI_
Graphical User Interface

## Clase 6

* El main lleva el HD (disco duro) a la RAM.
* class ----instancia----> objetos (instancia es la transformación de clase a la "vida")
* En el main(){} se pone toda la logistica que necesita el programa.
* _instancia_ : {crear -> utiliza constructor - new()}
* _constructor_ :es un "método" **público**; único (sobrecarga), debe tener el mismo nombre de la clase, se autodefine, se auto-ejecuta con **new()**, se ejercuta una sola vez.
* _objeto_ : {llamar -> llamada a método -> .metodo()}
 --> nombreObjeto (variable).
* _clase_ : {definición -> definiendo como funciona}
* La instancia tiene que estar ligada con un objeto.

## Clase 7

* Los métodos se documentan. Para ello se usa el slash y el asterisco.
_Proceso de casting_
* **cast explicito** : (float) ; (long) ; (double)
* **cast implicito** : Poniendo la L al final de un numero definido como long, llena los demás espacios con 0. Poner d o f define a los float y double
* Si no le ponemos nada a un metodo, por defecto devuelve null o vacío.
* En Java no podemos utilizar _definicion de datos_ como variables, ejemplo: int.

## Clase 8

### Tipos de datos

* En Java los tipos de datos primitivos se llaman valores, mientras que los tipos de datos complejos se llaman referencias.
**Primitivos**: Trabajan más rápido, no tienen objetos y no tienen métodos. Estos pueden ser: byte ,short,int,long,boolean,char,float,double.
**De referencia**: Ocupan más memoria, pero son más sencillos de cambiar, tiene un arsenal métodos.
**De objetos**: Ocupan muchísima memoria, tiene artillería para utilizar.

### String

* Array, conjunto de caracteres.
* Permite manejar los espacios de memoria.
* Se pueden guardar en variables.
* No hay limites de tamaño.
* _String & StringBluffer_ :Son inmutables, no afecta a la memoria. Se necesita forzar el cambio con concat para registrarle, y actualizar la variable.
* _StringBuilder_: Son mutables, afecta al espacio de memoria.

_Declaraciones de String_:
    String s2 = "TAT"; /un solo espacio con los que comparten el mismo "TAT"
    String s3 = new String("TAT"); / directo, un espacio propio en la memoria.
    --> Al crear un propio espacio en la memoria, no importa si contienen lo mismo, estas variables son distintas.
    Ejemplo:

* En el caso del _if_, lo que se ejecuta es lo que sucede cuando _str1==str2_ no se cumple.

    **java**
    java
    String str1 = new String("hola");
        String str2 = new String("hola");
        if (str1 == str2)
            System.out.println("str1==str2, La referencia del objeto es la misma");
        else
            System.out.println("str1==str2, La referencia del objeto es diferente");

_._
**¿Se puede asginar una variable sin espacio de memoria?**
Sí, cuando se declara la variable se va al STACK, si esta variable no está asignada a un espacio de memoria entonces dicha variable apunta a un NULL.

java
String sz;
        String Sn = new String();
**¿Y un espacio de memoria sin referencia?**
Sí, sin embargo no se puede utilizar.

java
for (;;) new String ("Te fregaste RAM");

* Para comparar el contenido de dos objetos, se utiliza: _.equal_.

* Para dividir una cadena de caracteres, es posible utilizar un array, y la función: _.split()_; dentro del paréntesis se pone el caracter por donde queremos dividir la cadena, de ese modo, dicho caracter no aparecerá y se dividirá con ello la cadena.
java
 String strSplit[] = str.split("\\."); // gfg abc 123 *-+ abc
        // for (int i = 0; i < strSplit.length; i++)
        System.out.println("str.split(\".\"): dividir la cadena según el punto: " + str);

* Para cambiar una variable a un String, hay que utilizar la función _String.valueOf(variable)_
java
int a = 12;
        str = str + a;
        str = str.concat(String.valueOf(a));

* El método _.contains()_ nos indica si una determinada cadena contiene el caracter colocado en el paréntesis.

* El método _trim()_ ayuda a eliminar espacios tanto a la izquierda, como a la derecha de una cadena.

* El método _indexOf_ devuelve el índice de la primera aparición de un elemento en una cadena.

## Clase 9

* Para hacer que el usuario ingrese información se utiliza la librería de Scanner.
* Este tiene que cerrar en la función global, ya que si se le cierra dentro de una clase, no se le puede utilizar más de una vez.
* Hacerlo en la función global logra ahorrar memoria, al crear un canal Scanner para todas las clases de la Aplicación.
_Arrays_
* Declarar arrays se realiza con un tipo de dato + [].
* Arrays son mutable, lo que significa que su tamaño se puede alterar.
* Los array tienen un constructor vacío y uno con parámetros.
* Se pueden declarar arrays multidimensionales.
* Al declarar una matriz con arreglo, es posible alterar el tamaño de las filas.
* Para recorrer el arreglo se utiliza _foreach_
* En java los arreglos son de longitud fija.
java
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

* Si queremos crear un arreglo de longitud dinámica, debemos usar ArrayList.
* Un ArrayList es una clase que nos permite agregar o eliminar elementos de manera flexible.
* La clase ArrayList tiene varios constructores, entre ellos el constructor por defecto.
* Con el constructor por defecto, se crea un ArrayList vacío.
* Para insertar un elemento al final del ArrayList, se utiliza el metódo add().
* Para borrar todos los elementos del ArrayList, se utiliza el metódo clear().

## Clase 10

* Solo se puede crear un bloque de trabajo denominado _public static void main(String[] args) {...}_ en este se desarrolla la ejecución del programa.
* Al definir una varible como _static_ se declara una constante, de esta manera no se desperdicia memoria almacenando una nueva variable.
* _public static final_: declara una constante solo de lectura.
*_public static_: se puede interactuar con dicha variable.
java
public static void main (String[] args) {
    ...
}
public static float PI = 3.14;
public static Mujer oMujer;
<rsc>
