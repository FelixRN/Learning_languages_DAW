import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double dateF; // Declaración de la variable
        System.out.println("Esto es un convertidor de temperatura");
        System.out.println("Ingresa un número con decimales: ");

        Scanner scanner = new Scanner(System.in);

        // Capturar el número de entrada
        dateF = scanner.nextDouble();

        System.out.println("¿En qué unidad lo quieres cambiar, grados o Fahrenheit?");
        String date = scanner.next();

        if (date.equalsIgnoreCase("grados")) {
            // Convertir de Fahrenheit a Celsius
            double celsius = (dateF - 32) * 5 / 9;
            System.out.println("La temperatura en grados Celsius es: " + celsius);
        } else if (date.equalsIgnoreCase("fahrenheit")) {
            // Convertir de Celsius a Fahrenheit
            double fahrenheit = (dateF * 9 / 5) + 32;
            System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);
        } else {
            System.err.println("Unidad no reconocida.");
        }

        scanner.close(); // Cerrar el escáner
    }
}

