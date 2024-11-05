import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.lang.Byte;

public class Main {
        public static void main(String[] args) {
            //Lista de Moviles
            List<Movil> movil;
            movil = new ArrayList<Movil>();

            //Instanciar tres Movilas y añadirlas a la lista
            Movil p1 = new Movil("Android", (byte) 8);
            Movil p2 = new Movil("Apple", (byte)8);
            Movil p3 = new Movil("Otros", (byte)16);

            movil.add(p1);
            movil.add(p2);
            movil.add(p3);




            //Recorrer la lista
            for(Byte i = 0; i< movil.size(); i++) {
                Movil p = movil.get(i);
                //Imprimir si tiene gafas
                //Opción: por propiedades
                //System.out.println("Las personas \"" + persona.getName() + " " + persona.getLastName() + ":" + (persona.getHasGlasses() ? " si tiene" : " no tiene"));
                System.out.println(p.toString());
            }
        }

}
