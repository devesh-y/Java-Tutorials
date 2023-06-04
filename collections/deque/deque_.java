import java.util.*;
public class deque_{
    public static void main(String[] args) {
        Deque<Integer> d=new ArrayDeque<>();
        d.addFirst(454);
        d.addLast(345);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
        d.removeFirst();
        d.removeLast();
        System.out.println(d.size());
        System.out.println(d);
    }
}