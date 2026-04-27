package complejidades;

public class ComplejidadLogaritmica {

    /**
     * Complejidad: O(log n)
     * Razón: El tamaño del problema
     * se divide entre 2 en cada paso.
     */

    public void ejemplo() {

        System.out.println("Ejemplo O(log n):");

        int n = 16;

        while (n > 1) {

            System.out.println(n);

            n = n / 2;

        }

    }
}
