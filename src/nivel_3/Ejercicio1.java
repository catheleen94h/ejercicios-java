package nivel_3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args){

        //crear lista
        List<String> frutas = new ArrayList<>();

        //añadir elementos
        frutas.add("Pera");
        frutas.add("Guayaba");
        frutas.add("Melocoton");
        frutas.add("Uva");
        frutas.add("Sandia");

        //mostrar lista
        System.out.println("Lista de frutas: "+ frutas);

        System.out.println("Ultima fruta: "+ frutas.get(frutas.size()-1));

        System.out.println("Numero de elementos: "+ frutas.size());

        System.out.println();
        System.out.println("Se elimino: "+ frutas.get(0));
        frutas.remove(0);


        for(String fruta : frutas){
            System.out.println(fruta);
        }

        System.out.println("Cantidad de frutas: "+ frutas.size());

    }

}
