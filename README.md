# Práctica: Algoritmo de Ordenamiento por Burbuja (Bubble Sort)

**Instituto Tecnológico Superior de Xalapa (ITSX)**  
**División de Ingeniería en Sistemas Computacionales**  
**Asignatura:** Estructura de Datos (Clave: AED-1026)[cite: 18]  
**Docente:** Mtro. Víctor Hugo Vásquez Herrera[cite: 18]  
**Alumno:** Gerardo González Ramírez  

---

## Descripción del Proyecto

El presente proyecto implementa en el lenguaje de programación **Java** el algoritmo de ordenamiento interno por **Burbuja (*Bubble Sort*)**, diseñado para reorganizar los elementos de un arreglo numérico de forma ascendente mediante comparaciones e intercambios adyacentes sucesivos.

Para optimizar su rendimiento computacional, el programa incorpora una **bandera de control booleana (`intercambiado`)**, la cual permite detectar de forma anticipada si el arreglo ya se encuentra completamente ordenado. Esto evita pasadas innecesarias y reduce la complejidad temporal en el mejor caso a $O(n)$.

---

## Estructura y Modularidad del Proyecto

El código fuente sigue una arquitectura modular y limpia, organizando la lógica del algoritmo separada de su clase de ejecución:

```text
src/
└── tareas/
    └── metodos_ordenamiento/
        ├── Burbuja.java        # Clase con la lógica del algoritmo y optimización por bandera
        └── MainBurbuja.java    # Clase ejecutable independiente para pruebas en consola