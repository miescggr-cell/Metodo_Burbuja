package tareas.metodos_ordenamiento;

public class Burbuja {
    public static void ordenar(int[] arr) {
        int n = arr.length;
        boolean intercambiado = false;

        // Bucle externo: controla las pasadas necesarias a través del arreglo.
        for (int i = 0; i < n - 1; i++) {
            intercambiado = false; // Reiniciamos la bandera en cada pasada

            // Bucle interno: compara elementos adyacentes.
            // Se resta 'i' porque los últimos 'i' elementos ya están ordenados de pasadas anteriores.
            for (int j = 0; j < n - i - 1; j++) {
                // Si el elemento actual es mayor que el siguiente, se intercambian
                if (arr[j] > arr[j + 1]) {
                    // Intercambio (Swap clásico usando una variable temporal)
                    int temp = arr[j]; // temp ayuda para no perder el número
                    arr[j] = arr[j + 1]; // igualamos los números o lugares
                    arr[j + 1] = temp; // recuperamos el número.

                    // Marcamos que sí hubo un intercambio en esta pasada
                    intercambiado = true;
                }
            }

            // OPTIMIZACIÓN: Si terminamos la pasada y la bandera sigue en falso,
            // significa que el arreglo ya está completamente ordenado y nos ahorramos ciclos.
            if (!intercambiado) { // si intercambiado es falso, si no hubo movimientos
                break; // rompemos el ciclo
            }
        }
    }

    /**
     * Método auxiliar para imprimir los elementos de un arreglo en formato de consola.
     * 
     * @param arr Arreglo a imprimir.
     */
    public static void imprimirArreglo(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}