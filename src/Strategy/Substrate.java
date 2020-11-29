package Strategy;

public class Substrate implements Strategy {
    @Override
    public int doOperate(int a, int b) {
        return a-b;
    }
}
