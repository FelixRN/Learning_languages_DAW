package EJERCICIO08;

public class Order {
    private String name;
    private Product Product;
    private Transport Transport;
    
    //Constructor
    public Order(String name , Product Product, Transport Transport){
        this.name = name;
        this.Product = Product;
        this.Transport = Transport;
    }
    //Para poder imprimirlo
    public String toString(){
        String  result = "Se pidio " + this.Product.toStringForOrder() + "y se pidio en fecha de " + this.name + " y el medio que se va a usar para transportarlo sera: " + this.Transport; 
        return result;
    }
    public void setOrder(String newname, Product newProduct, Transport newtransport){
        this.name = newname;
        this.Product = newProduct;
        this.Transport = newtransport;
        }
}
