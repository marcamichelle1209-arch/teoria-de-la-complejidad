package complejidades;

/**
 * Complejidad: O(n) - Lineal
 *  - El número de operaciones crece de forma PROPORCIONAL al tamaño
 *    del arreglo (n).
 *  - Hay un solo bucle que recorre cada elemento exactamente una vez.
 *  - Si n = 5  → 5 operaciones.
 *    Si n = 100 → 100 operaciones.
 *    Si n se duplica, el tiempo también se duplica.
 */
public class ComplejidadLineal {

    public void ejemplo() {

        System.out.println("=== Ejemplo O(n) - Complejidad Lineal ===");

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Recorriendo arreglo de " + numeros.length + " elementos:");

        // Un solo bucle → se ejecuta exactamente n veces
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("  Paso " + (i + 1) + ": elemento = " + numeros[i]);
        }

        // Ejemplo adicional: buscar el máximo → también O(n)
        int maximo = numeros[0];
        for (int num : numeros) {
            if (num > maximo) {
                maximo = num;
            }
        }

        System.out.println("Valor máximo encontrado: " + maximo);
        System.out.println("→ Con n=" + numeros.length + " elementos se hicieron " + numeros.length + " pasos.");
        System.out.println();
    }
}
