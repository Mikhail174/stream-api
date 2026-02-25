package ablazzing.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //Массивы
        int[] numbers  = {1,2,3};
        IntStream stream = Arrays.stream(numbers);
        stream.forEach(e-> System.out.print(e));
        System.out.println();

        //Создание из коллекции
        List<Integer> list = List.of(1, 2, 3);
        Stream<Integer> listStream = list.stream();
        listStream.forEach(e-> System.out.print(e));
        System.out.println();

        //Создание из элементов
        Stream<Integer> elementStream = Stream.of(1, 2, 3);
        elementStream.forEach(e-> System.out.print(e));
        System.out.println();

        //Создание их сапплаера
        Stream.generate(()->1).limit(3).forEach(e-> System.out.print(e));




    }
}
