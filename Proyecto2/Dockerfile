# Utiliza una imagen base de Java
FROM adoptopenjdk:11-jdk-hotspot

# Copia Jar al contenedor

COPY dist/Proyecto2.jar /app/Proyecto2.jar

# Establece el directorio de trabajo
WORKDIR /app

# Ejecuta la aplicación Java
ENTRYPOINT ["java", "-jar", "Proyecto2.jar"]

# Copia el archivo JAR y el Dockerfile al directorio de trabajo (en caso de que quieras crear una imagen usando este Dockerfile)
COPY dist/Proyecto2.jar /app/Proyecto2.jar
COPY Dockerfile /app/Dockerfile