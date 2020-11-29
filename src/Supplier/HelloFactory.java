package Supplier;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class HelloFactory {
    private static final Map<String , Supplier<? extends SayHello>> personLis = new HashMap<>();

    static {
        register("Eli" , Eli::new);
        register("Gholi" , Gholi::new);
        register("Goli" , Goli::new);
    }

    private static void register(String name , Supplier<? extends SayHello> supplier){
        personLis.put(name,supplier);
    }

    public static SayHello getPerson(String name){
        Supplier<? extends SayHello> supplier = personLis.get(name);
        return supplier != null ? supplier.get() : null;
    }
}
