# LlanquihueTourApp

## Descripción
Sistema de gestión de tours para la agencia Llanquihue Tour, ubicada en la Región de Los Lagos.
La aplicación carga tours desde un archivo externo, los almacena en una colección dinámica
y permite visualizarlos y buscarlos por consola.

## Paquetes y clases implementadas

- **model**: Contiene las clases del dominio.
    - `Tour.java`: Clase principal con atributos, constructores, getters/setters y toString().
    - `Guia.java`: Clase relacionada con Tour mediante composición.

- **data**: Contiene la lógica de carga de datos.
    - `GestorDatos.java`: Lee el archivo tours.txt y carga los objetos en un ArrayList.

- **resources**: Contiene los archivos externos.
    - `tours.txt`: Archivo con los datos de los tours.

## Instrucciones para ejecutar

1. Clona el repositorio o descarga el proyecto.
2. Abre el proyecto en IntelliJ IDEA.
3. Ejecuta la clase principal `ui.Main.java`.
4. El programa mostrará todos los tours, filtrará los culturales y pedirá un nombre para buscar.

## Tecnologías
- Java 21
- IntelliJ IDEA