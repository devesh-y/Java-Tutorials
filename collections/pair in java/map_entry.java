import java.util.*;
import java.util.AbstractMap.SimpleEntry;
public class map_entry {
    public static void main(String[] args) {
        Map.Entry<String, Integer> pair = new SimpleEntry<>("key", 1);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());
    }
}
