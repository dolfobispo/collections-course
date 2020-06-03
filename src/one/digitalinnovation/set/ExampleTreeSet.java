package one.digitalinnovation.set;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {
        TreeSet<String> capitais = new TreeSet<>();
        capitais.add("Porto Alegre");
        capitais.add("Florianópolis");
        capitais.add("Curitiba");
        capitais.add("São Paulo");
        capitais.add("Rio de janeiro");
        capitais.add("Belo Horizonte");

        System.out.println(capitais);


    }
}
