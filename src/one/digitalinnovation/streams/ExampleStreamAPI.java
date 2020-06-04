package one.digitalinnovation.streams;

import one.digitalinnovation.comparators.Estudante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamAPI {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos",23));
        estudantes.add(new Estudante("Mariana",21));
        estudantes.add(new Estudante("João",18));
        estudantes.add(new Estudante("Thiago",20));
        estudantes.add(new Estudante("George",22));
        estudantes.add(new Estudante("Larissa",21));
        //Tamanho da lista
        System.out.println("Contagem : "+estudantes.stream().count());
        //O mais velho
        System.out.println("Mais Velho: "+estudantes.stream().max(Comparator.comparing(Estudante::getIdade)));
        // O mais novo
        System.out.println("Mais Novo: "+estudantes.stream().min(Comparator.comparing(Estudante::getIdade)));
        //Estudantes que contem a letra L no nome.
        System.out.println(estudantes.stream().filter(estudante -> estudante.getNome().
                toLowerCase().contains("l")).collect(Collectors.toList()));
        //Imprime os 3 primeiros da lista
        estudantes.stream().limit(3).forEach(System.out::println);
        //Imprime o consumer interno e retorna uma Stream. ( no caso, usado o collect  retorna uma lista)
        System.out.println(estudantes.stream().
                peek(estudante -> System.out.println(estudante.getNome()))
                .collect(Collectors.toList()));
        // verifica se todos os elementos possuem a idade 21
        System.out.println(estudantes.stream().allMatch(estudante -> estudante.getIdade()==21));

        // verifica se Algum  dos elementos possui a idade 21
        System.out.println(estudantes.stream().anyMatch(estudante -> estudante.getIdade()==21));

        // verifica se nenhum  dos elementos possui a idade 21
        System.out.println(estudantes.stream().noneMatch(estudante -> estudante.getIdade()==21));

        //Stream Encadeado
        estudantes.stream()
        .peek(System.out::println)
        .filter(estudante -> estudante.getIdade() > 18)
        .collect(Collectors.groupingBy(Estudante::getIdade)).entrySet().forEach(System.out::println);
    }
}
