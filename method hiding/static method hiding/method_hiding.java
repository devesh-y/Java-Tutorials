//If a subclass defines a static method with the same signature as a static method in the superclass, then the method in the subclass hides the one in the superclass. This mechanism happens because the static method is resolved at the compile time. 


//Static method bind during the compile time using the type of reference not a type of object.


class base{
    static void func(){
        System.out.println("in base");
    }
}
class derived extends base{
    static void func(){
        System.out.println("in derived");
    }
}
public class method_hiding {
    public static void main(String[] args) {
        base b=new derived();
        b.func();

        //Static method bind during the compile time using the type of reference not a type of object.
    }
}
