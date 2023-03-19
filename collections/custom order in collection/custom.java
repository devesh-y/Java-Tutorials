import java.util.*;

public class custom {
    public static void main(String[] args) {

        //method 1
        PriorityQueue<Integer> pQueue
            = new PriorityQueue<Integer>(
                Collections.reverseOrder() );
 
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(5);
        System.out.println(pQueue);

        //method 2
        PriorityQueue<Integer> p= new PriorityQueue<Integer>(
            new Comparator<Integer>() {
           
                public int compare(Integer a, Integer b)
                {
                    if (a < b)
                        return 1;
                    if (a > b)
                        return -1;
                    return 0;
                }
            });


        PriorityQueue<Integer> q= new PriorityQueue<Integer>((a, b) -> b - a);
    }
}
