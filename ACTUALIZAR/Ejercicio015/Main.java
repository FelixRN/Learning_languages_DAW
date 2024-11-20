import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Lista de ls 5 libros
        
        List<Inventory> inventoryList;
        inventoryList = new ArrayList<Inventory>();

        //Preguntamos que libro va
        System.out.println("¿Que libro deseas buscar");
        Scanner scanner = new Scanner(System.in);
        String book = scanner.next();

        //Instanciar 5 
        //Colocar los colores en hexadecimal
        Inventory I1 = new Inventory(1, "La metamorfosis","Frank Kafka", 1801, 25.5f);
        Inventory I2 = new Inventory(2, "La torre oscura","Stephen King", 1802, 18.6f);
        Inventory I3 = new Inventory(3, "Kafka en la orilla","Haruki Murakami", 1803, 99.9f);
        Inventory I4 = new Inventory(4, "Psicologia de ventas","Brian Tracy", 1804, 25.47f);
        Inventory I5 = new Inventory(5, "45 leyes del poder","Robert Greene", 1805, 24.5f);

        inventoryList.add(I1);
        inventoryList.add(I2);
        inventoryList.add(I3);
        inventoryList.add(I4);
        inventoryList.add(I5);

        if(book.equals("La metamorfosis")){
            System.out.println(I1);
        } else if(book.equals("La torre oscura")){
            System.out.println(I2);
        } else if(book.equals("Kakfa en la orilla")){
            System.out.println(I3);
        } else if(book.equals("Psicoligia de ventas")){
            System.out.println(I4);
        } else{
            System.out.println(I5);
        }
scanner.close();
    
        //Recorrer lista
       //for (int i = 0; i < inventoryList.size(); i++){
            //Inventory Inventory = inventoryList.get(i);
            //Conversación - Cliente
           // System.out.println();
        }
    }

