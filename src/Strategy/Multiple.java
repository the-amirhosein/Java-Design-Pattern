package Strategy;

public class Multiple implements Strategy {
    @Override
    public int doOperate(int a, int b) {
        return a*b;
    }
}
