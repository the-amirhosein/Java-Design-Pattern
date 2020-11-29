package designPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate(new Add());
        System.out.println(calculate.executeStrategy(50, 10));

        calculate = new Calculate(new Substrate());
        System.out.println(calculate.executeStrategy(50, 10));

        calculate = new Calculate(new Multiple());
        System.out.println(calculate.executeStrategy(50, 10));
    }
}
