//if you want to define function in an interface then you have to use a default method

//DON'S CONFUSE AND MIX IT WITH DEFAULT ACCESS MODIFIERS

//default method are defined in latest documentation can be used in interfaces only

interface e1{
    default void hello(){
        System.out.println("in e1");
    }
}

interface e2 {
    default void hello1(){
        System.out.println("in e2");
    }
    
}
class base implements e1,e2 {
    void hello3(){
        System.out.println("in base");
    }


    //here if you are using the same name function as in interface then you must use public in that case
    //as by public we can use it in different package also
    public void hello(){
        System.out.println("in base");
    }

}

public class interface2 {
    public static void main(String[] args) {
        base b1=new base();
        b1.hello();
        b1.hello1();
        b1.hello3();

    }
}
