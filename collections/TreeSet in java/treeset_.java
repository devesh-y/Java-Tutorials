import java.util.TreeSet;

public class treeset_ {
    public static void main(String[] args) {
        TreeSet<Integer> arr=new TreeSet<Integer>();
        arr.add(45);
        arr.clear();
        arr.add(23);
        arr.add(4545);
        arr.add(1);
        arr.add(1);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr.contains(1));
        System.out.println(arr.ceiling(4777667));//important, return least element greater than or equal to it
        System.out.println(arr.floor(34)); //return greater element less than or equal to it
        System.out.println(arr.first());
        System.out.println(arr.last());

        System.out.println(arr.size());

        System.out.println(arr.lower(34));//return greatest element less then it
        System.out.println(arr.higher(45));// return least element strictyle greater then it

        arr.pollFirst();  //remove first element
        arr.pollLast();  //remove last element
        


    }
}
