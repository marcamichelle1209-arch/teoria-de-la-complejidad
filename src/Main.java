import complejidades.ComplejidadConstante;
import complejidades.ComplejidadLineal;
import complejidades.ComplejidadCuadratica;
import complejidades.ComplejidadLogaritmica;
import complejidades.ComplejidadNLogN;

/**
 * Clase principal.
 * Ejecuta el ejemplo de cada complejidad en orden creciente de coste.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("╔══════════════════════════════════════════════╗");
        System.out.println("║   Teoría de la Complejidad — Práctica 4.1    ║");
        System.out.println("║   Estructura de Datos                        ║");
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println();

        new ComplejidadConstante()  .ejemplo();   // O(1)
        new ComplejidadLogaritmica().ejemplo();   // O(log n)
        new ComplejidadLineal()     .ejemplo();   // O(n)
        new ComplejidadNLogN()      .ejemplo();   // O(n log n)
        new ComplejidadCuadratica() .ejemplo();   // O(n²)
    }
}