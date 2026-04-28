package complejidades;

/**
 * Complejidad: O(n²) - Cuadrática
 *  - Hay DOS bucles anidados, cada uno recorre los n elementos.
 *  - Total de operaciones = n × n = n².
 *  - Si n = 5  →  25 operaciones.
 *    Si n = 10 → 100 operaciones.
 *    Si n se duplica, el tiempo se CUADRUPLICA.
 *  - Es costosa para entradas grandes; se debe evitar cuando sea posible.
 */
public class ComplejidadCuadratica {

    public void ejemplo() {

        System.out.println("=== Ejemplo O(n²) - Complejidad Cuadrática ===");

        int[] numeros = {1, 2, 3, 4, 5};
        int operaciones = 0;

        System.out.println("Pares (i , j) generados con n=" + numeros.length + ":");

        // Bucle externo: n veces
        for (int i = 0; i < numeros.length; i++) {

            // Bucle interno: n veces → en total n × n = n² iteraciones
            for (int j = 0; j < numeros.length; j++) {
                operaciones++;
                System.out.println("  (" + numeros[i] + " - " + numeros[j] + ")");
            }
        }

        System.out.println("Total de operaciones: " + operaciones
                + "  (n² = " + numeros.length + "² = " + (numeros.length * numeros.length) + ")");
        System.out.println("→ Con n=10 serían 100 operaciones; con n=100 serían 10.000.");
        System.out.println();
    }
}