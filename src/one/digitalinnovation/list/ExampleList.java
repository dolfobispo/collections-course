package one.digitalinnovation.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExampleList {

    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Anderson");
        nomes.add("Flavio");

        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        nomes.set(1,"Caio");
        System.out.println(nomes);

        nomes.remove("Flavio");
        nomes.forEach(s -> System.out.println(s));
        System.out.println(nomes.isEmpty());

        Iterator<String> iterator = nomes.iterator();
        while(iterator.hasNext()){
            System.out.println("-> " + iterator.next());
        }
        nomes.clear();
        List<String> outrosNomes= new ArrayList<>();
        outrosNomes.add("Bispo");
        outrosNomes.add("Marcio");
        System.out.println(nomes.addAll(outrosNomes));
        System.out.println(nomes);


    }
}
