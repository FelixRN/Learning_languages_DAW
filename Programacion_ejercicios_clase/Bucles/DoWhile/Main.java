package DoWhile;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 10;

        int i = min;
        do{
            System.out.println(i);
            i++;
        }while(i<=min || i<=max);
    }
}
