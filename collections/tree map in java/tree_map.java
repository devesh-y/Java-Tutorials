import java.util.*;

public class tree_map {
    public static void main(String[] args) {
        TreeMap<String,Integer> map=new TreeMap<String,Integer>();
        map.put("sfs", 34);
        map.clear();
        map.put("dsfsfs", 34);
        map.put("ddd", 34);
        map.put("ff", 34);
        System.out.println(map.size());

        System.out.println(map.containsKey("dfdf"));
        System.out.println(map.containsValue(34));


        System.out.println(map.get("343"));  //null if not present
        map.remove("dfd");
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        

    }
}
