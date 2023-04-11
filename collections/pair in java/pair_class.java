
import javafx.util.Pair;
public class pair_class {
    public static void main(String[] args) 
    {


        Pair<Integer, String> p = new Pair<>(10, "Hello Geeks!");
        Pair<Integer, String> q = new Pair<>(10, "Hello Geeks!");
        System.out.println(p==q);
        System.out.println(p);

        System.out.println(p.getValue());
        System.out.println(p.getKey());
        
    }
}
