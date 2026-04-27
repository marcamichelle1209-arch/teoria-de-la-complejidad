package complejidades;

public class ComplejidadCuadratica {

    /**
     * Complejidad: O(n²)
     * Razón: Usa dos ciclos anidados.
     */

    public void ejemplo() {

        System.out.println("Ejemplo O(n²):");

        int[] numeros = {1,2,3,4,5};

        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros.length; j++) {

                System.out.println(numeros[i] + " - " + numeros[j]);

            }

        }

    }
}