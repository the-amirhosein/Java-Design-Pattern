package Factory;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        System.out.println(Objects.requireNonNull(HelloFactory.getPerson("Eli")).SayHello());
        System.out.println(Objects.requireNonNull(HelloFactory.getPerson("Gholi")).SayHello());
        System.out.println(Objects.requireNonNull(HelloFactory.getPerson("Goli")).SayHello());
    }
}
