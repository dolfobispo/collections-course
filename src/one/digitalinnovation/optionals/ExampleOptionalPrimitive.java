package one.digitalinnovation.optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExampleOptionalPrimitive {

    public static void main(String[] args) {
       OptionalInt.of(12).ifPresent(System.out::println);
       OptionalDouble.of(34.2).ifPresent(value -> System.out.println(value+20));
        OptionalLong.of(32l).ifPresent(value -> System.out.println(value));

    }
}
