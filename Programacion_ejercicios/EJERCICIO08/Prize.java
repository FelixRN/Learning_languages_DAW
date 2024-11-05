package EJERCICIO08;

public class Prize {
    private String Prize;
    
    //Constructor
    public Prize(String Prize){
        this.Prize = Prize;
    }
    public String getValue(){
        return this.value;
    }
    public String toString(){
        String result = " cuesta " + Prize; 
        return result;
    }
}
