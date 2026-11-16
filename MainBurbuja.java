package tareas.metodos_ordenamiento;

public class MainBurbuja {

    public static void main(String[] args) {
        // Arreglo de ejemplo
        int[] arreglo = {6, 1, 5, 8, 3, 2, 7, 4};

        System.out.println("Arreglo original:");
        Burbuja.imprimirArreglo(arreglo);

        // Llamamos al método de ordenamiento
        Burbuja.ordenar(arreglo);

        System.out.println("Arreglo ordenado:");
        Burbuja.imprimirArreglo(arreglo);
    }
}