package Ejercicios_Clase.Ejercicio0017_2;

import java.util.Scanner;

public class Main {
    // Método para calcular el factorial de un número
    public static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para calcular su factorial: ");
        int number = scanner.nextInt();

        // Calculamos el factorial y mostramos el resultado
        int result = factorial(number);
        System.out.println(number + " factorial = " + result);

        // Ejemplo adicional (factorial de 10)
        number = 10;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
        
        scanner.close();
    }
}

