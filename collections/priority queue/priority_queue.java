import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        //min heap is default
        p.add(54);
        System.out.println(p.size());
        p.clear();
        p.add(54);
        p.add(54);
        p.add(34);
        p.add(54);
        System.out.println(p.peek());
        p.poll();
        
        

    }
}
