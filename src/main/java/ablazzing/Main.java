package ablazzing;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

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

        Function<Integer,String> automate = (money) -> {
            if (money == 100) {
                return "Cola";
            } else if (money == 50) {
                return "Water";
            }else {
                return "Nothing";
            }
        };
        System.out.println(automate.apply(100));

        Consumer<String> fire = (item) -> {
          if (item.equals("дрова")){
              System.out.println("Горит огонь долго");
          } else if (item.equals("бумага")){
              System.out.println("Горит огонь быстро");
          }
        };
        fire.accept("дрова");

        Supplier<Integer> talons = () -> new Random().nextInt(100);
        System.out.println(talons.get());

        Student ivan = new Student(190);
        Student petr = new Student(180);
        Student nik = new Student(170);

        List <Student> students = new ArrayList<>();
        students.add(new Student(190));
        students.add(new Student(180));
        students.add(new Student(170));
        students.add(new Student(150));
        students.add(new Student(250));
        students.add(new Student(10));

        System.out.println(students);

        Comparator<Student> studentComparatorAsc = (st1,st2) -> st1.getHeight() - st2.getHeight();
        students.sort(studentComparatorAsc);
        System.out.println(students);
        Comparator<Student> studentComparatorDesc = (st1,st2) -> st2.getHeight() - st1.getHeight();
        students.sort(studentComparatorDesc);
        System.out.println(students);


        List<Circle> circles = List.of(new Circle("Yellow"),new Circle("Yellow"),new Circle("Yellow"));

        Stream<Circle> stream = circles.stream();
        stream.forEach(circle -> circle.setColor("Purple"));

        System.out.println(circles);


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
