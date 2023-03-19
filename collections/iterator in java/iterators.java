import java.util.Iterator;
import java.util.*;
import java.util.TreeSet;

public class iterators {
    public static void main(String[] args) {
        TreeSet<Integer> s=new TreeSet<>();
        s.add(343);
        
        System.out.println(s);

        Iterator<Integer> itr=s.iterator();//it will point before the first element of object
        System.out.println(itr.hasNext());
        itr.next();
        System.out.println(itr.hasNext());
        s.add(34);
        s.add(34);
        s.add(534);
        s.add(3434);

        itr=s.iterator();
        
        while(itr.hasNext()){
            int i=itr.next();
            System.out.println(i);

        }
        itr=s.iterator();
        itr.next();
        
        itr.remove();//removes the current element
        // itr.remove();   //cannot call now
        //can call 1 per itr.next()
        System.out.println(s);


        


    }
}
