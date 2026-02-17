package optional;

import org.w3c.dom.ls.LSOutput;

import java.time.Instant;
import java.util.Optional;
import java.util.function.Consumer;

import static optional.Utils.*;

public class Main {
    public Main() throws Exception {
    }

    public static void main(String[] args) throws Exception {

        //Создание
        Optional<String> optional = Optional.of("Hello");
        Optional<String> empty = Optional.empty();
     //   Optional<String> nullable = Optional.ofNullable(getStringThatMightBeNull());
        Employee employee = new Employee("KIB","Popov","Mikhail");
        String department = Utils.getManagerName(employee).get();
        System.out.println(department);


        //если не null
        Optional<String> opt = Optional.ofNullable(getString());
        System.out.println(opt.get());
        System.out.println(opt.orElse("default"));
        System.out.println(opt.orElseGet(Utils::getStringNull));
        System.out.println(opt.orElseThrow(()->new Exception ("Exceeption!")));
        //выполнить если значение есть
        opt.ifPresent(System.out::println);
        //map()
        Optional<String> s = opt.map(el -> el + "hahaha")
                        .map(elem->elem+"zazaza");

        System.out.println(s.get());
        //flatmap()

        Optional<Optional<String>> bad = getOptionalOPtional();
        System.out.println(bad);
        Optional<String> good = bad.flatMap(el->el);
        System.out.println(good);

        //filter
        Optional<Employee> dep1 = Utils.optionalForFilter()
                .filter(el->el.getDepartment().equals("1"));
        System.out.println(dep1.get());

        Optional<String> name3 = dep1
                .filter(el->el.getDepartment().equals("1"))
                .map(Employee::getName);
        System.out.println(name3.get());






        //если null
        System.out.println("===================");

        Optional<String> opt2 = Optional.ofNullable(getStringNull());
       // System.out.println(opt.get()); - NPE
        System.out.println(opt2.isPresent());
        System.out.println(opt2.isEmpty());
        System.out.println(opt2.orElse("default"));
        System.out.println(opt2.orElseGet(Utils::getStringNull));
        opt2.ifPresentOrElse(System.out::println,()-> System.out.println("not value"));
        System.out.println(opt2.orElseThrow(()->new Exception ("Exceeption!")));





    }



    //плохо
    public void process (Optional<String> param) {

    }













}
