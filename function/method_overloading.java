public class method_overloading {

    static void hello(int a){
        System.out.println("i am in hello");
    }
    static int hello(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(hello(34,34));
        hello(5);
    }
}
