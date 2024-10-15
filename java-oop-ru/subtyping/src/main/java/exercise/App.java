package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
    public static void swapKeyValue(KeyValueStorage storage) {
        Map<String, String> map = storage.toMap();
        Map<String, String> newMap = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            newMap.put(value, key);
        }

        for (String key : map.keySet()) {
            storage.unset(key);
        }

        for (Map.Entry<String, String> entry : newMap.entrySet()) {
            storage.set(entry.getKey(), entry.getValue());
        }
    }
}
// END
