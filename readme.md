# CLASE 1

## IDE

Entorno de desarrollo integrado.

## Segunda clase

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

# Clase 3

## GIT

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

## Linux

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

# Clase 4

## branch + merge

----<><><....>---|---              (main)-----< (req / fix)
                 |                   ^
                 |       C1          |
                 |---<><>|--...------|*(Config)
                        759e31a

## Linux (continuación)

1. git branch -m main (renombrar rama)
2. git checkout main (cambiar a la rama principal)
3. git log (historial de commits)
