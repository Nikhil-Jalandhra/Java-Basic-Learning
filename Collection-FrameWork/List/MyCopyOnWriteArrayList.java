package List;

import java.util.concurrent.CopyOnWriteArrayList;

public class MyCopyOnWriteArrayList {
    public static void main(String[] args){
        // on every modification new copy will be generated of the list
        // This ensure that other thread reading the list while it's being modified are unaffectaed
        // Thread Safe..
        // Recomended when read more || modification less
        CopyOnWriteArrayList<String> carsList = new CopyOnWriteArrayList<>();

        carsList.add("Mercides");
        carsList.add("G-Wagon");
        carsList.add("Volvo");
        carsList.add("Bently");

        for(String s : carsList){
            if(s == "Volvo"){
                carsList.add("Bugati");
            }
        }

        System.out.println(carsList);

    }
}
