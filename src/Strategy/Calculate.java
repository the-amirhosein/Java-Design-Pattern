package Strategy;

public class Calculate {

    private final Strategy strategy;

    public Calculate(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int a , int b){
        return strategy.doOperate(a,b);
    }
}
