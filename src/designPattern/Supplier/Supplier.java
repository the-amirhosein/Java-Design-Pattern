package designPattern.Supplier;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}
