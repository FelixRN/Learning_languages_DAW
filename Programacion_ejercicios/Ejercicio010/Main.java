public class Main {
    public static void main(String[]arg) {
        int num1 = 20;
        int num2 = 20;
        controlIfElse(num1, num2);
        controlSwitch(num1, num2);
        controlTernary(num1, num2);


    }
    private static void controlIfElse (int num1, int num2){
        System.out.println("Control IfElse");
        if (num1 < num2 ){
            System.out.println("Num 1 ("+num1+") es menor que num2 ("+num2+")");
        }

        else if (num1 > num2 ){
            System.out.println("Num 1 ("+num1+") es mayor que num2 ("+num2+")");
        }

        else if (num1 == num2 ){
            System.out.println("Num 1 ("+num1+") es igual que num2 ("+num2+")");
        }

        else  {
            System.out.print("Error");
        }
        System.out.println();
    }

    private static void controlSwitch (int num1, int num2){
        System.out.println("Control Switch");
        switch (Integer.signum(num2 - num1)) {
            case -1:
                System.out.println("Num 1 ("+num1+") es menor que num2 ("+num2+")");
                break;
            case 0:
                System.out.println("Num 1 ("+num1+") es igual que num2 ("+num2+")");
                break;
            case 1:
                System.out.println("Num 1 ("+num1+") es mayor que num2 ("+num2+")");
                break;
            default:
                System.out.println("Error al compara num1("+num1+") y num2("+num2+")");
        }
    }
    private static void controlTernary(int num1, int num2){
        System.out.println("Ternary");
        String comparativeResult = (num1 > num2) ? "mayor" : "menor o igual";
        System.out.println("Num 1 ("+num1+") es "+comparativeResult+" ("+num2+")");
    }
}
