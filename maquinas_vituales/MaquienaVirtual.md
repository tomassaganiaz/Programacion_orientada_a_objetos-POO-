# Cuestionario Práctico - Máquinas Virtuales, Docker y GitHub Actions

## Máquinas Virtuales

1. ¿Qué es una máquina virtual y para qué se utiliza?

2. Nombrá dos diferencias entre una máquina virtual y una computadora física.

3. ¿Qué función cumple un hipervisor?

4. Mencioná dos programas que permitan crear máquinas virtuales.

5. ¿Qué significa asignar 4 GB de RAM a una máquina virtual?

6. ¿Qué es una imagen ISO y para qué sirve?

7. ¿Para qué se utiliza SSH al conectarse a una máquina virtual Linux?

8. Escribí el comando para conectarte por SSH al usuario `admin` en la IP `192.168.1.50`

9. ¿Qué significa que una máquina virtual sea efímera?

10. ¿Qué ventaja tiene usar snapshots en una VM?

---

 Máquinas Virtuales

1. Una máquina virtual es un entorno que simula una computadora física dentro de otra, usada para pruebas, desarrollo o ejecutar sistemas distintos.

2. Diferencias:

La VM depende de recursos asignados por el host, la física usa todo su hardware.

La VM puede coexistir con otras en el mismo host, la física es única.

3. El hipervisor administra y coordina las máquinas virtuales sobre el hardware físico.

4. ejemplos: VirtualBox, VMware Workstation.

VirtualBox: es un software libre y gratuito de Oracle que permite crear y administrar máquinas virtuales en distintos sistemas operativos (Windows, Linux, macOS). Es muy usado en entornos educativos y de pruebas porque es sencillo y multiplataforma.

VMware Workstation: es un software comercial de VMware que ofrece más rendimiento y opciones avanzadas para virtualización en equipos de escritorio. Se utiliza mucho en entornos profesionales porque soporta integraciones más robustas y mejor manejo de recursos.

5. Significa que la VM podrá usar hasta 4 GB de memoria RAM del host.

6. Una ISO es una imagen de disco que contiene el sistema operativo o software para instalar.

7. SSH se usa para conectarse de forma segura y remota a la VM Linux.

8. Escribí el comando para conectarte por SSH al usuario admin en la IP 192.168.1.50

El comando correcto es:

```bash

ssh admin@192.168.1.50

```
9. Efímera = que se crea y destruye rápidamente, sin persistencia.

10. Los snapshots permiten guardar el estado de la VM y volver atrás si algo falla.
