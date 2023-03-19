//In Java, method hiding is the ability of a subclass to override a method defined in a superclass and have it behave differently when called from the subclass.
//it happens at compile time
class base{
    void func(){
        System.out.println("in base");
    }
}
class derived extends base{
    void func(){
        System.out.println("in derived");
    }
}
public class method_hiding {
    public static void main(String[] args) {
        derived d=new derived();
        d.func();//method hiding
    }
}
