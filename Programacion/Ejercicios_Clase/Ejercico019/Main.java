package Ejercico019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introducde por teclado un número:");
        int num = scanner.nextInt();
        System.out.println(" El número introducido es el " + num);
        
        scanner.close();
    }
}
