package Hanoi_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instanciamos la clase Scanner para leer el número de discos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de discos de la torre: ");
        int numero = teclado.nextInt();
        teclado.close();

        // Crea una instancia de la clase Hanoi y llama al método "resolver"
        Hanoi torre = new Hanoi();
        torre.resolver(numero, "origen", "auxiliar", "destino");
    }
}

