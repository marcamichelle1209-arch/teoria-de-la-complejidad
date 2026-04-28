package complejidades;

public class ComplejidadNLogN {

    public void ejemplo() {

        System.out.println("=== Ejemplo O(n log n) - Complejidad N Log N ===");

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        int operacionesTotales = 0;

        System.out.println("Arreglo de n=" + numeros.length + " elementos.");
        System.out.println("Por cada elemento se realiza una reducción logarítmica:\n");

        // Bucle externo: recorre cada uno de los n elementos → O(n)
        for (int i = 0; i < numeros.length; i++) {

            int n = numeros.length;
            int pasosInternos = 0;

            // Bucle interno: divide n entre 2 hasta llegar a 1 → O(log n)
            while (n > 1) {
                n = n / 2;
                pasosInternos++;
                operacionesTotales++;
            }

            System.out.println("  Elemento [" + numeros[i] + "] → pasos internos (log): " + pasosInternos);
        }

        int n = numeros.length;
        int logN = (int)(Math.log(n) / Math.log(2));

        System.out.println("\nTotal operaciones reales:   " + operacionesTotales);
        System.out.println("Esperado n × log₂(n) = " + n + " × " + logN + " = " + (n * logN));
        System.out.println("→ Crece más rápido que O(n) pero mucho menos que O(n²).");
        System.out.println();
    }
}