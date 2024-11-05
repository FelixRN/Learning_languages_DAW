import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Lista de ls 5 botes de pintura
        List<Botes> botes = new ArrayList<>();

        //Instanciar 5 botes de pintura
        //Colocar los colores en hexadecimal
        Bote p1 = new Bote(Reveton, 8, ff2d00 );
        Bote p2 = new Bote(Blumestukko, 5, 000dff);
        Bote p3 = new Bote(Duraval, 12, c7bda7);
        Bote p4 = new Bote(Macy, 9, 24ff00);
        Bote p5 = new Bote(TitanLak, 10, fff700);


            bote.add(p1);
            bote.add(p2);
            bote.add(p3);
            bote.add(p4);
            bote.add(p5);

        //Recorrer lista
        for (int i = 0; i < bote.size(); i++){
            Bote p = bote.get(i);
            //Imprimir resultado A
            System.out.println((p.get));
        }
    }
}