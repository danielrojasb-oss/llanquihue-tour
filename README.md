# LlanquihueTourApp

Aplicación Java desarrollada para gestionar información de tours y servicios turísticos utilizando Programación Orientada a Objetos.

## Descripción

Durante las semanas anteriores, el proyecto permitió leer información de tours desde un archivo de texto (`tours.txt`) y realizar búsquedas y filtros.

En esta versión se incorporaron nuevos conceptos de Programación Orientada a Objetos:

- Herencia mediante la clase `ServicioTuristico`.
- Sobrescritura (`@Override`) del método `mostrarInformacion()`.
- Polimorfismo utilizando referencias de tipo `ServicioTuristico`.
- Uso de colecciones genéricas (`List<ServicioTuristico>`) para almacenar y recorrer diferentes tipos de servicios turísticos.

## Funcionalidades

- Leer información de tours desde un archivo de texto.
- Mostrar todos los tours disponibles.
- Filtrar tours por tipo.
- Buscar tours por nombre.
- Mostrar distintos servicios turísticos aplicando herencia y polimorfismo.

## Estructura del proyecto

```
src
├── model
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   ├── ExcursionCultural.java
│   ├── Tour.java
│   └── Guia.java
│
├── data
│   ├── GestorDatos.java
│   └── GestorServicios.java
│
└── ui
    └── Main.java

resources
└── tours.txt
```

## Tecnologías utilizadas

- Java 21
- IntelliJ IDEA
- Git
- GitHub

## Instrucciones para ejecutar

1. Clona el repositorio o descarga el proyecto.
2. Abre el proyecto en IntelliJ IDEA.
3. Ejecuta la clase principal `ui.Main`.
4. El programa mostrará:
  - Todos los tours.
  - Los tours culturales.
  - La búsqueda por nombre.
  - Los servicios turísticos utilizando herencia y polimorfismo.

## Autor

**Daniela Rojas Báez**