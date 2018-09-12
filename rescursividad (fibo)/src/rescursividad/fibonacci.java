package rescursividad;

import java.util.Vector;

public class fibonacci {

    public static void main(String[] args) {
        fibonacci(40, new Vector(), 0);
        //using_for();

    }

    public static void fibonacci(int limit, Vector<Long> serie, int i) {

        if (serie.isEmpty()/* size() == 0*/) {
            serie.add(new Long(0));
            serie.add(new Long(1));
        }
        //agregar
        serie.add(
                new Long(
                        serie.get(serie.size() - 1) + serie.get(serie.size() - 2)
                )
        );
        //Mostrar

        System.out.println(String.format("%,d   [%d]", serie.get(i), i));
        //incremento
        i++;
        //repetir
        if (i <= limit) {
            fibonacci(limit, serie, i);
        }
    }

    public static void using_for(int limit) {
        Vector<Long> serie = new Vector<>();
        if (serie.isEmpty()/* size() == 0*/) {
            serie.add(new Long(0));
            serie.add(new Long(1));
        }
        for (int i = 0; i <= 40; i++) {

            //agregar
            serie.add(
                    new Long(
                            serie.get(serie.size() - 1) + serie.get(serie.size() - 2)
                    )
            );
            //Mostrar

            System.out.println(String.format("%,d   [%d]", serie.get(i), i));
        }
    }
}
