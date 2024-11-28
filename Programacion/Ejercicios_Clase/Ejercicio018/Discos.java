import java.time.Year;

public class Discos {
    private int id;
    private int size;
    

    public Disc(int id, int size){
        this.id = id;
        this.size = size;
    }

    public int getId(){
        return this.id;
    }
    
    public String getsize(){
        return this.size;
    }

    @Override
    public String toString(){
        return "Discos" + id + "Tamaño" + size ;
    }
}
