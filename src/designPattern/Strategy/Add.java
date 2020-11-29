package designPattern.Strategy;

public class Add implements Strategy {
    @Override
    public int doOperate(int a, int b) {
        return  a+b;
    }
}
