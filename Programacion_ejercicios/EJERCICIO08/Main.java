package EJERCICIO08;

public class Main {
    public static void main(String[] args) {
        Transport newTransport = new Transport("Mojodojocar");
        Prize newPrize = new Prize("450 euros");
        Product nameProduct = new Product("5G", newPrize);
        Order newOrder = new Order("16/10/2024", nameProduct, newTransport);
        System.out.println(newOrder.toString());
        
        //Nuevas instancias
        Transport otherTransport = new Transport("Barco");
        Prize otherPrize = new Prize("69.69 euros");
        Product otherProduct = new Product("que se pidio es una réplica exacta de Bugs Bunny", otherPrize);
        Order otherOrder = new Order("16/10/2029", otherProduct, otherTransport);
        System.out.println(otherOrder.toString());



    }
}
