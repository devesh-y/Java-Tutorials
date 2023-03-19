
public class static_execution {
    //static execution happen in order you write it
    //here m1 will execute first then static block

    static int a = m1();
      
    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }
      
    // static method(main !!)
    public static void main(String[] args)
    {
       System.out.println("Value of a from main : "+a);
       System.out.println("from main");
    }
}