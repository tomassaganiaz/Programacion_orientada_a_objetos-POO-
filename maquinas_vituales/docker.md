## Docker

11. ¿Cuál es la diferencia entre imagen Docker y contenedor Docker?

12. ¿Qué comando muestra los contenedores en ejecución?

13. ¿Qué comando muestra todos los contenedores, incluso detenidos?

14. ¿Qué comando se usa para descargar una imagen de Ubuntu?

15. ¿Qué comando crea y ejecuta un contenedor Ubuntu interactivo?

16. ¿Qué significa mapear el puerto `8080:80`?  

17. Nombrá tres estados posibles de un contenedor Docker.

18. ¿Qué comando detiene un contenedor llamado `webapp`?

19. ¿Qué comando elimina un contenedor llamado `mysql-db`?

20. Escribí un ejemplo simple de `docker run` con nginx exponiendo puerto 8080.


 Docker

11. Diferencia entre imagen Docker y contenedor Docker

Imagen: es un archivo inmutable que contiene el sistema base, librerías y configuraciones necesarias. Piensa en ella como una “plantilla” o “receta”.

Contenedor: es la instancia en ejecución de esa imagen. Es dinámico, puede modificarse mientras corre y se puede detener, reiniciar o eliminar.

12. Comando para mostrar contenedores en ejecución

```bash

docker ps

```
muestra solo los que están activos en ese momento.

13. Comando para mostrar todos los contenedores (incluidos detenidos)

```bash

docker ps -a

```
14. Comando para descargar una imagen de Ubuntu

```bash

docker pull ubuntu

```

Descarga la última versión de la imagen oficial de Ubuntu desde Docker Hub.

15. Comando para crear y ejecutar un contenedor Ubuntu interactivo

```bash

docker run -it ubuntu

```

-it = modo interactivo con terminal.

 Esto te abre una consola dentro del contenedor Ubuntu.

16. El puerto 8080 del host (tu PC) se conecta al puerto 80 del contenedor (donde suele correr un servidor web).

- Así, si el contenedor tiene un servidor en el puerto 80, lo accedes desde tu navegador en http://localhost:8080.

17. Tres estados posibles de un contenedor Docker

running → en ejecución.

exited → detenido.

paused → congelado temporalmente.

También existen otros como restarting o created, pero los tres básicos son esos.

18. Comando para detener un contenedor llamado webapp

```bash

docker stop webapp

```
Detiene el proceso del contenedor sin eliminarlo.

19. Comando para eliminar un contenedor llamado mysql-db

```bash

docker rm mysql-db

```


20.  Ejemplo simple de docker run con nginx exponiendo puerto 8080

```bash

docker run -d -p 8080:80 nginx


```

-d → modo “detached” (en segundo plano).

-p 8080:80 → mapea el puerto.

Con esto, si abrís http://localhost:8080, ves la página por defecto de Nginx.
