package one.digitalinnovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos",23));
        estudantes.add(new Estudante("Mariana",21));
        estudantes.add(new Estudante("João",18));
        estudantes.add(new Estudante("Thiago",20));
        estudantes.add(new Estudante("George",22));
        estudantes.add(new Estudante("Larissa",21));

        System.out.println(estudantes);
        /*
        estudantes.sort((o1, o2) -> o1.getIdade()-o2.getIdade());
        System.out.println(estudantes);
       estudantes.sort((o1, o2) -> o2.getIdade()-o1.getIdade());
        System.out.println(estudantes);

        */
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println(estudantes);

        Collections.sort(estudantes,new ComparatorExternalClass());
        System.out.println(estudantes);
    }
}
