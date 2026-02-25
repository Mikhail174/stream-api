package ablazzing.Operator;

public class HighOrderFunctionalExample {
    public static void main(String[] args) {
        Operator operator = new Operator();

        //функции низшего порядка
        OperatorAction creditCardAction = ()-> System.out.println("Не хотите ли приобрести кредитную карту?");
        OperatorAction phoneChangeAction = ()-> System.out.println("Не хотите ли сменить тариф?");
        OperatorAction socialAction = () -> {
            System.out.println("Сколько лет?");
            System.out.println("Любите ли собак?");
        };
        operator.call(creditCardAction);
        operator.call(phoneChangeAction);
        operator.call(socialAction);


    }
}
