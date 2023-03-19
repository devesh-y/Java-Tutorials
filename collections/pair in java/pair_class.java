import java.util.*;
import javafx.util.*;
public class pair_class {
    public static void main(String[] args) 
    {

        Pair p1=new Pair(4, 34);
        System.out.println(p1);
        //dont use the above one

        Pair<Integer, String> p = new Pair<>(10, "Hello Geeks!");
        System.out.println(p);

        System.out.println(p.getValue());
        System.out.println(p.getKey());
    }
}
