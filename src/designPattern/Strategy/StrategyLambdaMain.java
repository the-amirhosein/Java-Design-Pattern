package designPattern.Strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyLambdaMain {

    static Map<String, Strategy> strategies = new HashMap<>();

    static {
        strategies.put("+", new Add());
        strategies.put("-", new Substrate());
        strategies.put("*", new Multiple());
    }

    public static void main(String[] args) {

        System.out.println(execute(50, "+", 10));
        System.out.println(execute(50, "-", 10));
        System.out.println(execute(50, "*", 10));

    }

    static int execute(int a, String operator, int b) {
        return strategies.get(operator).doOperate(a, b);
    }

}
