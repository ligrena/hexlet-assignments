package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static <T> List<String> validate(T object) {
        List<String> result = new ArrayList<>();
        Class<?> clazz = object.getClass();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getAnnotation(NotNull.class)!= null) {
                try {
                    if (field.get(object) == null) {
                        result.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
}
// END
