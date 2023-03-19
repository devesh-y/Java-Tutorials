
class base{
    static void func(){
        System.out.println("in base");
    }
}

public class static_mem_function 
{
    public static void main(String[] args) {
        base.func();  //after the static items in this class
    }
    static int a=func2();  //here this function executed when class loaded
    static int func2(){
        System.out.println("functin called");
        return 20;
    }
    
}