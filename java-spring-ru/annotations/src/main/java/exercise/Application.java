package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        for (Method m : Address.class.getMethods()) {
            if (m.isAnnotationPresent(Inspect.class)) {
                System.out.println(m.getAnnotation(Inspect.class));
            }
        }
        // END
    }
}
