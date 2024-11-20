package If_Else;

public class Main {
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 10;
        controlIfElse(num1, num2);
    }
    public static void controlIfElse(int num1, int num2) {
        System.out.println("control IfElse");
        if (num1 < num2) {
            System.out.println("num1 ("+num1+") es menor que num2 ("+num2+")");
        } else if (num1 > num2) {
            System.out.println("num1 ("+num1+") es mayor que num2 ("+num2+")");
        }  else if (num1 == num2) {
            System.out.println("num1 ("+num1+") es igual que num2 ("+num2+")");
        }  else  {
            System.out.println("Error al comparar num1 ("+num1+") y num2("+num2+")");
        } 
    }
}
