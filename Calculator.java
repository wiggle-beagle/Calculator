import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> addition = (a, b) -> a + b;
    BinaryOperator<Integer> subtraction = (a, b) -> a - b;
    BinaryOperator<Integer> multiplication = (a, b) -> a * b;
    BinaryOperator<Integer> divide = (x, y) -> {
        if (y == 0)
            throw new RuntimeException();
        else return x / y;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> {
        return x > 0 ? x : x * -1;
    };


    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;


}


