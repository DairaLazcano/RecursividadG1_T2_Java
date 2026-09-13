package recursividad.logica;

public class Recursividades {
    
    public int calcularFactorial(int num) {
        // Caso base o condición de salida
        if (num == 1) {
            return 1;
        }

        // Caso general (se llama a sí misma)
        return num * calcularFactorial(num - 1);
    }
    
    public int contarVocales(String cadena) {
        if (cadena.isEmpty()) { 
            return 0;
        }

        char primeraLetra = Character.toLowerCase(cadena.charAt(0));
        int contadorVocales = 0;

        if (primeraLetra == 'a' || primeraLetra == 'e' || primeraLetra == 'i' || primeraLetra == 'o' || primeraLetra == 'u') {
            contadorVocales = 1;
        }

        return contadorVocales + contarVocales(cadena.substring(1));
    }
    
    public int sumaDigitos(int numero) {
        if (numero == 0) {
            return 0;
        }

        return (numero % 10) + sumaDigitos(numero / 10);
    }

    public int sumarNumeros(int numero) {
        if (numero == 0) {
            return 0;
        }

        return numero + sumarNumeros(numero - 1);
    }
    
}
