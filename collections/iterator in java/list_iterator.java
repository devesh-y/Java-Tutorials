import java.util.ArrayList;
import java.util.ListIterator;

public class list_iterator {
    public static void main(String[] args) {
        ArrayList<Integer> h=new ArrayList<Integer>();
      
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);

        ListIterator itr=h.listIterator();
        while(itr.hasNext()){
            int i=(Integer) itr.next();

            // System.out.println(itr.nextIndex());
            //get next index

            System.out.println(i);
            //now i will change the values

            itr.set(34);
            //add element after current element 
            itr.add(56);

        }
        System.out.println(h);


        //for getting the previous element 
        //use
        System.out.println(itr.hasPrevious());
        // itr.previous();   //go backward

        
    }
}
