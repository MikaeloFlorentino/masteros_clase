# Usa una imagen base de JDK (por ejemplo, OpenJDK 17)
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /

# Copia el archivo JAR a la imagen
COPY clase-0.0.1-SNAPSHOT.jar app.jar
COPY external-config.properties external-config.properties

# Expone el puerto en el que la aplicación escucha
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar", "--spring.config.location=file:external-config.properties"]