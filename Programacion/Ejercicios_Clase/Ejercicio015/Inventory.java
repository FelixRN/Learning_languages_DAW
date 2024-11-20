public class Inventory {
    private int id;
    private String title;
    private String autor;
    private int year;
    private float price;

    public Inventory(int id, String title, String autor, int year, float price){
        this.id = id;
        this.title = title;
        this.autor = autor;
        this.year = year;
        this.price = price;
    }

    public int getId(){
        return this.id;
    }
    
    public String getTitle(){
        return this.title;
    }

    public String getAutor(){
        return this.autor;
    }
    public int getYear(){
        return this.year;
    }

    public float getPrice(){
        return this.price;
    }

    @Override
    public String toString(){
        return id + ", Título" + title + " ,autor" + autor + " ,año de publicación " + year + ", precio: " + price + " euros";
    }
}
