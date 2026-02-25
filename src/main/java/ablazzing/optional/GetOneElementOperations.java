package ablazzing.optional;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class GetOneElementOperations {
    public static void main(String[] args) {
        List<Integer> integers = List.of(4,8,2);
        System.out.println(integers.stream()
                .findFirst()
                .orElse(10));

        Optional<Integer> max = integers.stream().max((a,b)->a-b);
        Optional<Integer> min = integers.stream().min((a,b)->a-b);
        System.out.println("Min: "+min.get());
        System.out.println("Max: "+max.get());


        List<Student> students = List.of(new Student(10, "Misha"),
                new Student(11, "Anna"),
                new Student(21, "Katya")
        );

        Optional<Student> max1 = students.stream()
                .max((student1, student2) -> student1.getAge() - student2.getAge()); //Comparator.comparingInt(Student::getAge)
        System.out.println(max1.get());

        Optional<Student> min1 = students.stream()
                .min((student1, student2) -> student1.getName().length() - student2.getName().length());
        System.out.println(min1.get());


    }
}
