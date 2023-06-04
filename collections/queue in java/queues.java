import java.util.*;

public class queues {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(3535);
        q.add(535);
        q.add(335);
        q.add(5);
        q.poll();
        q.remove(5);
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
