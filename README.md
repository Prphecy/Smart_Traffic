# SmartTraffic MVC

Sistema inteligente de tráfico desarrollado en Java con Spring Boot utilizando arquitectura MVC y estructuras de grafos.

## Descripción

SmartTraffic MVC representa ciudades como nodos y rutas como aristas dentro de un grafo no dirigido.  
El sistema permite visualizar rutas, niveles de tráfico y ejecutar algoritmos de recorrido como BFS y DFS.

## Tecnologías utilizadas

- Java
- Spring Boot
- Maven
- Thymeleaf
- HTML/CSS
- IntelliJ IDEA

## Algoritmos implementados

- BFS (Breadth First Search)
- DFS (Depth First Search)

## Estructura General del Proyecto

```text
SmartTraffic
└── src
    └── main
        ├── java
        │   └── com.parcial.smarttraffic
        │       ├── algorithm
        │       │   └── GraphAlgorithms.java
        │       ├── controller
        │       │   ├── HomeController.java
        │       │   └── TrafficController.java
        │       ├── exception
        │       ├── model
        │       │   ├── Ciudad.java
        │       │   └── Ruta.java
        │       ├── service
        │       │   └── TrafficService.java
        │       └── SmartTrafficApplication.java
        └── resources
            ├── static
            │   └── CSS
            │       └── styles.css
            └── templates
                ├── index.html
                ├── mapa.html
                └── algoritmos.html
                └── application.propertie
  
```
## Vistas principales
/ → Página principal
/mapa → Visualización del grafo
/algoritmos → BFS, DFS e historial

## Ejecución
```text
mvn spring-boot:run
```
Luego abrir en el navegador:
```text
http://localhost:8080
```
**IMPORTANTE:** Si se requiere mas información del proyecto, leer el PDF anexado en la entrega de TEAMS titulado "SmartTraffic MVC 1"
