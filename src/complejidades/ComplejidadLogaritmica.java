package complejidades;
/**
 * Complejidad: O(log n) - Logarítmica
 *  - En cada iteración el tamaño del problema se divide a la MITAD.
 *  - Esto significa que el número de pasos crece muy lentamente:
 *      n = 16  → 4 pasos  (log₂ 16 = 4)
 *      n = 256 → 8 pasos  (log₂ 256 = 8)
 *      n = 1.048.576 → solo 20 pasos
 *  - Es una de las complejidades más eficientes después de O(1).
 */
public class ComplejidadLogaritmica {

    public void ejemplo() {

        System.out.println("=== Ejemplo O(log n) - Complejidad Logarítmica ===");

        int n = 16;
        int pasos = 0;

        System.out.println("Dividiendo n=" + n + " entre 2 en cada paso:");

        // El valor de n se divide entre 2 en cada iteración → O(log n)
        while (n > 1) {
            pasos++;
            System.out.println("  Paso " + pasos + ": n = " + n);
            n = n / 2;
        }
        System.out.println("  Paso " + (pasos + 1) + ": n = " + n + " → fin");

        System.out.println("Total de pasos para n=16: " + (pasos + 1)
                + "  (log₂ 16 = 4)");
        System.out.println("→ Duplicar la entrada solo añade 1 paso más.");
        System.out.println();
    }
}