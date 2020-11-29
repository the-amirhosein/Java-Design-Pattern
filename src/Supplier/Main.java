package Supplier;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        System.out.println(Objects.requireNonNull(HelloFactory.getPerson("Eli")).sayHello());
        System.out.println(Objects.requireNonNull(HelloFactory.getPerson("Gholi")).sayHello());
        System.out.println(Objects.requireNonNull(HelloFactory.getPerson("Goli")).sayHello());
    }
}
