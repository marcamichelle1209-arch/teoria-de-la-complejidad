package complejidades;

/**
 * Complejidad: O(1) - Constante
 *
 *  - El número de operaciones es FIJO, siempre el mismo.
 *  - No depende del tamaño del arreglo ni de los datos de entrada.
 *  - No existen bucles ni llamadas recursivas.
 *  - Si el arreglo tiene 5 o 5.000.000 elementos, se ejecutan
 *    exactamente las mismas instrucciones.
 */
public class ComplejidadConstante {

    public void ejemplo() {

        System.out.println("=== Ejemplo O(1) - Complejidad Constante ===");

        // Operación aritmética simple → siempre O(1)
        int x = 10;
        int y = 20;
        int suma = x + y;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("Resultado de x + y = " + suma);

        // Acceso directo por índice → también O(1),
        // sin importar cuántos elementos tenga el arreglo
        int[] numeros = {5, 10, 15, 20, 25};
        int primero = numeros[0];
        int ultimo  = numeros[numeros.length - 1];

        System.out.println("Arreglo de " + numeros.length + " elementos.");
        System.out.println("Primer elemento: " + primero);
        System.out.println("Último  elemento: " + ultimo);

        System.out.println("→ Siempre 2 accesos, sin importar el tamaño del arreglo.");
        System.out.println();
    }
}
