package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        //вывести топ 2 повторяющихся слов
        List<String> words = List.of("apple","tea","milk","coffee","apple","tea","coffee","coffee");

         words.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                 .entrySet().stream()
                 .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                 .limit(2)
                 .forEach(entry -> System.out.println(entry.getKey() + "="+ entry.getValue()));

    }

}
