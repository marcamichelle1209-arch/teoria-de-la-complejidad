package complejidades;

public class ComplejidadNLogN {

    /**
     * Complejidad: O(n log n)
     * Razón: Un ciclo lineal que contiene
     * una operación logarítmica.
     */

    public void ejemplo() {

        System.out.println("Ejemplo O(n log n):");

        int[] numeros = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < numeros.length; i++) {

            int n = numeros.length;

            while (n > 1) {

                n = n / 2;

            }

            System.out.println(numeros[i]);

        }

    }
}