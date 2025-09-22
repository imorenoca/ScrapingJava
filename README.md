Proyecto de Python - scrapingPython - realizado en Java.

El programa se conecta a una página web y obtener la fecha de actualización de la página.

Para poder realizar este proyecto en Java, es necesario crear un proyecto Maven para poder instalar las dependencias para que funcione.

File>New>Maven Proyect

Las dependencias se obtienen de la página web https://mvnrepository.com/artifact/org.jsoup/jsoup/1.21.2  

  ```
  <dependencies>
    <dependency>
        <groupId>org.jsoup</groupId>
        <artifactId>jsoup</artifactId>
        <version>1.21.2</version>
    </dependency>
  </denpendencies>
  ```
 
 Realizar el ejecutable.

En la carpeta del proyecto, botón derecho seleccionamos:  

Java>Runnable Jar file.
 
Es importante seleccionar “Package required libraries into generated JAR”.

Botón derecho en el archivo y ejecutar. 