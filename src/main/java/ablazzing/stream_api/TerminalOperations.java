package ablazzing.stream_api;

import java.util.List;
import java.util.stream.Stream;

public class TerminalOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3);
        Stream<Integer> integerStream = integers.stream();
        System.out.println("Кол-во элементов: "+ integerStream.count());

        System.out.println("Печатаем на экран элементы: ");
        Stream<Integer> integerStream2 = integers.stream();
        integerStream2.forEach(e->{
            System.out.println("Печатаем элемент: ");
            System.out.println(e);
        });

    }
}
