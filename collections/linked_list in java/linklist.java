import java.util.*;
//its a doubly ended list 
//and can get values by indexing  - take O(n)
public class linklist {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("A");
        ll.clear();
        ll.add(0,"B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.remove(0);
        ll.removeLast();
        System.out.println(ll.contains("78"));
        System.out.println(ll.get(0));

        System.out.println(ll.indexOf("34"));
        
        

    }
}
