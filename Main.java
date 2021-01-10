public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.addition.apply(1, 2);
        int b = calculator.subtraction.apply(1, 1);

        int c = calculator.divide.apply(a, b);
        calculator.println.accept(c);


    }
}
