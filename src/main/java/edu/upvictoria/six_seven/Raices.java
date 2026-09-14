package edu.upvictoria.six_seven;

//Hago uso de la  clase math para poder calcular las raices, ya viene incluida en java.

//---------- RECORDATORIO -----------:
//Math.sqrt(x) = accede a la funcion sqrt dentro de la clase math. (sqrt = square root (raiz cuadrada)).
//Math.pow(x) = accede a la funcion pow dentro de math. ( pow = clacula la potencia de un numero al elevar la base a un exponente ).
//Math.PI = accede a la constante pi.
//.Nan "Not a Number" Es un valor especial para errores.


public class Raices {

    // Raíz cuadrada.
    public static double raizCuadrada(double x) {
        if (x < 0) {
            System.out.println("Error: no existe raíz cuadrada de un número negativo.");
            return Double.NaN; // "Not a Number" — valor especial para errores
        }
        return Math.sqrt(x);
    }

    // Raíz cúbica.
    public static double raizCubica(double x) {
        return Math.cbrt(x);
    }

    // Raíz n-ésima.
    public static double raizNesima(double x, double n) {
        if (n == 0) {
            System.out.println("Error: el índice no puede ser 0.");
            return Double.NaN;
        }
        if (x < 0 && n % 2 == 0) {
            System.out.println("Error: índice par con número negativo no tiene solución real.");
            return Double.NaN;
        }
        return Math.pow(x, 1.0 / n);
    }
}
