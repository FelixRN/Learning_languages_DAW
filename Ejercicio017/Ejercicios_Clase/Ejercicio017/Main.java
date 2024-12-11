package Ejercicios_Clase.Ejercicio017;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generar secuencia de Fibonacci
        System.out.println("Ahora generaremos una secuencia de Fibonacci");
        System.out.print("Ingresa el primer número de la secuencia: ");
        int fib1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número de la secuencia: ");
        int fib2 = scanner.nextInt();

        System.out.print("¿Cuántos números deseas generar en la secuencia? ");
        int max = scanner.nextInt();

        fibonacci(fib1, fib2, max);

        // Consumir el salto de línea pendiente después de nextInt()
        scanner.nextLine();

        // Invertir una cadena de texto
        System.out.println("\nIngresa una cadena de texto para invertirla:");
        String inputUser = scanner.nextLine();
        String reversedUserInput = invertirCadena(inputUser);
        System.out.println("La cadena invertida es: " + reversedUserInput);
    }

    // Método para generar la secuencia de Fibonacci
    public static void fibonacci(int num1, int num2, int MAX) {
        System.out.println("\nSecuencia de Fibonacci:");
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");

        for (int i = 2; i < MAX; i++) {
            int fibonacci = num1 + num2;
            System.out.print(fibonacci + " ");
            num1 = num2;
            num2 = fibonacci;
        }
        System.out.println(); // Salto de línea al final de la secuencia
    }

    // Método para invertir una cadena
    public static String invertirCadena(String cadena) {
        StringBuilder reversed = new StringBuilder(cadena);
        return reversed.reverse().toString();
    }
}


