# Grafos dirigidos con peso en Java

Proyecto creado para la materia Matemáticas Discretas II de la Universidad del Valle.

## Funcionalidades

- Crear grafos dirigidos con peso
- Agregar aristas
- Representar grafos mediante lista de adyacencia
- Mostrar el grafo en consola
- Calcular el grado de un vértice
- Detectar multigrafos
- Verificar si un grafo es completo
- Leer grafos desde archivos `.txt`

---

## Estructura del proyecto

```text
src/
│
├── Main.java
├── Graph.java
├── Edge.java
├── FileManager.java
│
├── graph.txt
└── README.md
```

---

## Explicación de las clases

### Main.java

Clase principal del proyecto.

Se encarga de:

- crear el grafo
- cargar el archivo
- imprimir el grafo
- ejecutar las funciones de prueba

---

### Graph.java

Contiene toda la lógica y representación del grafo.

Funciones implementadas:

- `addEdge()`
- `printGraph()`
- `getDegree()`
- `isMultigraph()`
- `isComplete()`

---

### Edge.java

Representa una arista del grafo.

Contiene:

- nodo destino
- peso de la conexión

---

### FileManager.java

Clase encargada de leer el archivo `.txt`.

Usa `Scanner` para leer línea por línea y convertir los datos del archivo en conexiones reales dentro del grafo.

---

## Cómo ejecutar el programa

Situarse en la carpeta raíz del proyecto y ejecutar:

```bash
javac *.java
java Main
```

---

## Autores

- Benjamin Lopera
- Sebastian Martinez

Universidad del Valle  
Matemáticas Discretas II

---

## Historial

26/05/2026

- Implementación de lista de adyacencia usando `HashMap`
- Lectura automática de grafos desde archivos `.txt`
- Implementación de clase `Edge`
- Implementación de cálculo de grado
- Verificación de multigrafo
- Verificación de grafo completo
- Impresión del grafo en consola
- Reestructuración del proyecto en múltiples clases
