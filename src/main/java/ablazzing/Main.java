package ablazzing;

import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //посчитать количество яблок
        List<String> products = List.of("яблоко","молоко","печенье","масло","яблоко");
        int count =0;
        for (String product : products) {
            if (product.equals("яблоко")) {
                count++;
            }
        }
        System.out.println(count);

        long count1 = products.stream()
                .filter(el -> el.equals("яблоко"))
                .count();

        System.out.println(count1);

        System.out.println(sum(2,1));
        System.out.println(sumDirty(2,1));

        //=====================================================

        Airplane airplane = new Airplane();
        airplane.fly();

        Flyable airplane2 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Самолет летит ");
            }
        };
        airplane2.fly();

        Flyable airplane3 = () -> System.out.println("Самолет летит");
        airplane3.fly();

        Calc calc2 = new Calc() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        };
        calc2.add(2,3);

        Calc calc = (a,b)->a+b;
        System.out.println(calc.add(2,3));

        Flyable airplane4 = () -> {
            System.out.println("Самолет взлетает");
            System.out.println("Самолет садится");
        };
        airplane4.fly();

        Calc calc3 = (a,b)->{
            System.out.println("Печатаю результат");
            return a+b;
        };
        calc3.add(2,3);


        Predicate<Integer> isAdult = (age) -> age>17;
        System.out.println(isAdult.test(30));




    }

    //чистая функция
    public static int sum (int a, int b) {
        return a+b;
    }

    //НЕчистая функция
    public static int sumDirty (int a, int b) {
        return a+b+new Random().nextInt();
    }

    //НЕчистая функция2
    public static int sumDirty2 (int a, int b) {
        System.out.println("Печатаю на экран результат");
        return a+b+new Random().nextInt();
    }


}
