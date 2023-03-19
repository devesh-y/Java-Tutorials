//here the reference and object are of same type so its same inheritace as normal class

abstract class base{

    int f;
    base(){
        System.out.println("base constructor");
    }
    void func1(){
        System.out.println("in base");
    }
    
  
    
}
class derived extends base{

    derived()
    {
        System.out.println("derived constructor");
    }
    void func(){  
        System.out.println("in derived");
    }
    
    
}
public class abstract_class {
    public static void main(String[] args) {
        // base b=new base();// abstract means you cannot make an object of that class
        derived b=new derived();
        b.func();
        b.func1();
    }
}
