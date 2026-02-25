package ablazzing.Operator;

public class Operator {

    //Функия высшего порядка
    public void call (OperatorAction operatorAction){

        System.out.println("Оператор начинает звонок");
        operatorAction.action();
        System.out.println("Оператор заканчивает звонок");
    }

    }


