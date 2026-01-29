package oops.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1001, "Panda");
        m.put(1002, "Rudra");
        m.put(1003, "Crazy");
        m.put(1002, "DJ");
        // Value can be repeated but not the key
        System.out.println(m);
    }
}
