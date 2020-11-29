package designPattern.Factory;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class HelloFactory {
    private static Map<String , Class<? extends SayHello>> personLis = new HashMap<>();

    static {
        register("Eli" , Eli.class);
        register("Gholi" , Gholi.class);
        register("Goli" , Goli.class);
    }

    private static void register(String name , Class<? extends SayHello> _class){
        personLis.put(name,_class);
    }

    public static SayHello getPerson(String name){
        Class<?> c = personLis.get(name);
        try {
            return (SayHello)c.getDeclaredConstructor(new Class[]{}).newInstance(new Object[]{});
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
