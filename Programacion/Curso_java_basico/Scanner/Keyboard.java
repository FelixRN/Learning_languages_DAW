package Scanner;
import java.util.Scanner;

public class Keyboard {
    private static Scanner Scanner = new scanner;
    
    public static String text(){
        String text = scanner.nextLine();
        return text;    
    }

    public static int nextInt() {
        int nInt = scanner.nextInt();
        scanner.nextLine();
        return nInt;
    }

    public static float nextFloat(){
        float nFloat = scanner.nextFloat();
        scanner.nextLine();
        return nFloat;
    }

    public static double nextDouble() {
        double nDouble = scanner.nextDouble();
        scanner.nextLine();
        return nDouble;
    }
}
