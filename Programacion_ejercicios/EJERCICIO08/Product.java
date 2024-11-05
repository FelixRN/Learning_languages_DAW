package EJERCICIO08;

public class Product {
    private String name;
    private Prize Prize;
    
    //Constructor
    public Product(String name , Prize Prize){
        this.name = name;
        this.Prize = Prize;
    }
    public String toString(){
        return "una moto " + this.name + " y" + this.Prize; 
    }
    public void setProduct(String newname){
    this.name = newname;
}

    public String getName(){
        return this.name;
    }

    public String getPrecio(){
        return this.Prize;
        
    }

    public String toStringForOrder(){
        String result = this.name + "(" + this.Prize.getValue()+")";
    }
}