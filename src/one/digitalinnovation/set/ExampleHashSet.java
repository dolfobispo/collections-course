package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {

    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(1.2);
        notasAlunos.add(5.4);
        notasAlunos.add(9.2);
        notasAlunos.add(3.5);
        notasAlunos.add(8.3);
        notasAlunos.add(6.7);
        notasAlunos.add(7.8);
        notasAlunos.add(10.0);

        System.out.println(notasAlunos);
        notasAlunos.remove(3.5);
        System.out.println(notasAlunos);
        Iterator<Double>  iterator = notasAlunos.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
