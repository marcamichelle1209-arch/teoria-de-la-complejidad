package complejidades;

public class ComplejidadLineal {

    /**
     * Complejidad: O(n)
     * Razón: El número de operaciones depende
     * del tamaño del arreglo.
     */

    public void ejemplo() {

        System.out.println("Ejemplo O(n):");

        int[] numeros = {1,2,3,4,5};

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }

    }
}
