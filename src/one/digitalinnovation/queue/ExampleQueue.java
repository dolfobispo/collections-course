package one.digitalinnovation.queue;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class ExampleQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Pamela");
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);
        filaBanco.poll();
        System.out.println(filaBanco);
        System.out.println(filaBanco.peek());

        filaBanco.clear();
        try {
            filaBanco.element();
        }catch (NoSuchElementException e){
            System.out.println("lista vazia");
        }

    }
}
