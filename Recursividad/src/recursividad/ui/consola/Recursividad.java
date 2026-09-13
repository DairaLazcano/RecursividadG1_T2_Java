package recursividad.ui.consola;

import recursividad.logica.Recursividades;

public class Recursividad {    //Daira Airy Lazcano Sánchez - 3F21

    public static void main(String[] args) {
        System.out.println("Ejemplos de recursividad");
        
        Recursividades oRecursividades = new Recursividades();
        
        System.out.println("\n\tFactorial\n");
        int resultadoFactorial = oRecursividades.calcularFactorial(5);
        System.out.println("El resultado 5! es: " + resultadoFactorial);

        System.out.println("--------------------------------------------------");
        
        System.out.println("\n\tContar vocales\n");
        int resultadoVocales = oRecursividades.contarVocales("Daira");
        System.out.println("El numero de vocales en 'Daira' es: " + resultadoVocales);

        System.out.println("--------------------------------------------------");

        System.out.println("\n\tSuma de digitos\n");
        int[] secuencia = { 45, 128, 99, 3, 2048 };
        int maxSuma = 0;
        int numeroMaxSuma = 0;
        
        System.out.println("Evaluando secuencia:");
        for (int numero : secuencia) {
            int sumaActual = oRecursividades.sumaDigitos(numero);
            System.out.println("Numero: " + numero + " -> Suma de sus digitos: " + sumaActual);

            // Determinar si es el que tiene la suma mayor
            if (sumaActual > maxSuma) {
                maxSuma = sumaActual;
                numeroMaxSuma = numero;
            }
        }
        System.out.println("\nEl numero con la mayor suma de digitos es: " + numeroMaxSuma + " (Suma: " + maxSuma + ")\n");

        System.out.println("--------------------------------------------------");
        
        System.out.println("\n\tSumar numeros\n");
        int resultadoSuma = oRecursividades.sumarNumeros(5);
        System.out.println("La suma de los numeros del 1 al 5 es: " + resultadoSuma);
    }
    
}
