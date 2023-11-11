import java.util.function.*; // для работы калькулятора нужно
// заимпортить все встроенные функциональные интерфейсы

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;

    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> { //обработаем исключение деления на 0
        if (y == 0) {
            System.out.println("Ошибка . На ноль делить нельзя.");
            return 0;
        } else {
            return x / y;
        }
    };


    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;


}