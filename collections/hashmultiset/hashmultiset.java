import java.util.*;
  
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
  
class hashmultiset {
  
    // Driver code
    public static void main(String args[])
    {
        Multiset<String> multiset = HashMultiset.create();
  
        // Adding elements to multiset
        multiset.add("Geeks");
        multiset.add("for");
        multiset.add("Geeks");
        multiset.add("for");
        multiset.add("GeeksforGeeks");
        multiset.add("Geeks");
        multiset.add("GeeksforGeeks");
        multiset.add("Geeks");
  
        System.out.println("Total Size is : " + multiset.size());
  
        System.out.println("Occurrences of Geeks are : " + multiset.count("Geeks"));
  
        System.out.println("Occurrences of for are : " + multiset.count("for"));
  
        System.out.println("Occurrences of GeeksforGeeks are : " + multiset.count("GeeksforGeeks"));
    }
}