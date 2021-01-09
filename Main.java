public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.addition.apply(5, 7);
        int b = calculator.multiplication.apply(7, 9);
        int c = calculator.pow.apply(6);
        calculator.println.accept(c);


    }
}
