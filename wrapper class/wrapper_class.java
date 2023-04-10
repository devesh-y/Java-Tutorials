
public class wrapper_class{
    public static void main(String[] args) {
        int i = 10;
        Integer integer = i; // boxing happens automatically

        Integer integ = new Integer(11);
        int p = integ; // unboxing happens automatically
        System.out.println(p);

        
    }
}