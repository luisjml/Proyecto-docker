# Proyecto-docker
proyecto Spring-mongo-docker

EL repositorio dispone del Dockerfile y el Docker-compose.yml para desplegar el servidor de MongDB y la imagen de docker desde la consola de docker.

Pasos para el despliegue:
1. Ejecutar Maven Install para generar la imagen "spring-boot-docker.jar"
2. Utilizar el comando  docker-compose up  desde la consola en el repositoio.

Esto levantara el continer de MongoDB y luego el container de la aplicacion.


