package oops.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> str = new HashSet<String>();
        str.add("Hello");
        str.add("OMG");
        str.add("Hello");
        str.add("Crazy");

        System.out.println(str);

        Set<String> str1 = new TreeSet<String>();
        str1.add("Hello");
        str1.add("OMG");
        str1.add("Hello");
        str1.add("Crazy");

        System.out.println(str1);
    }
}
