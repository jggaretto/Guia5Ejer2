/*
En un nuevo proyecto en el método main de su clase principal, se pide crear un algoritmo que
rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden
descendente.
 */
package guia5ejer2;



public class Guia5Ejer2 {
    public static void main(String[] args) {
        int[] vector = new int[100];

        // Rellenar el vector con los 100 primeros números enteros
        for (int i = 0; i < 100; i++) {
            vector[i] = i + 1;
            
        }
        String aux = "";
        // Mostrar el vector en orden descendente
        System.out.println("**VECTOR DE 100 NUMEROS ENTEROS EN ORDEN DESCENDENTE**");
        System.out.println("RESULTADO:");
        for (int i = 99; i >= 0; i--) {
            aux += " " + (vector[i]);
        }
        System.out.println(aux);
    }
}
    