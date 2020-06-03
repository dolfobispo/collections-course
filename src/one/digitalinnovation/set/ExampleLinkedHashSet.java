package one.digitalinnovation.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new LinkedHashSet<>();
        notasAlunos.add(1.2);
        notasAlunos.add(5.4);
        notasAlunos.add(9.2);
        notasAlunos.add(3.5);
        notasAlunos.add(8.3);
        notasAlunos.add(6.7);
        notasAlunos.add(7.8);
        notasAlunos.add(10.0);
        notasAlunos.add(null);
        System.out.println(notasAlunos);
    }
}
