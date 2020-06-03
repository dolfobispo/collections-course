package one.digitalinnovation.optionals;

import one.digitalinnovation.comparators.Estudante;
import one.digitalinnovation.exceptions.OptionalException;

import java.util.Optional;

public class ExampleOptionals {

    public static void main(String[] args) {
        Optional<Estudante> estudante  = Optional.of(new Estudante("Rodolfo",28));
        estudante.ifPresentOrElse(System.out::println,()-> System.out.println("Obj vazio"));
        /*
        estudante = Optional.ofNullable(null);
        estudante.ifPresentOrElse(System.out::println,()-> System.out.println("Obj vazio"));

        estudante = Optional.empty();
        estudante.ifPresentOrElse(System.out::println,()-> System.out.println("Obj vazio"));

       estudante  = Optional.of(null);
       estudante.ifPresentOrElse(System.out::println,()-> System.out.println("Obj vazio"));

       */
        estudante.map(Estudante::getIdade).ifPresent(System.out::println);
        estudante = Optional.empty();
        try {
            estudante.orElseThrow(()->new OptionalException("Null pointer erro"));
        } catch (OptionalException e) {
            System.out.println(e.getMensagem());
        }

    }
}

