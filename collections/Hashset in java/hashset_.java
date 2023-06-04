

import java.util.*;

public class hashset_ {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
    
        set.addAll(list1);
        
        System.out.println(set);
        set.add(34);
        System.out.println(set.contains(23));
        set.remove(34);
        System.out.println(set.size());
        set.clear();
    }
    

}
