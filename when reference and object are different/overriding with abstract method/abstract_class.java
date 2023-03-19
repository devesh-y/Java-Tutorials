abstract class base {
    int f;

    base() {
        System.out.println("base constructor");
    }

    abstract void func();// this is an abstract method
    // but its not compulsory to define any abstract method in a abstract class
    // if you are defining any method abstract then you have to declare the class a abstract
    // abstract method have no body
    

    //abstract void hello();    //if you are declaring a abstract method that is not defined in derived class then it will give error


    void func3() {
        System.out.println("func3 in base");
    }

}
class derived extends base {

    derived() {
        System.out.println("derived constructor");
    }

    void func() {
        System.out.println("in derived");
    }

    void func1() {
        System.out.println("in derived");
    }

}
public class abstract_class {
    public static void main(String[] args) {
        // base b=new base();// abstract means you cannot make an object of that class

        base b = new derived();
        b.func();  //here if you want to use the function of derived class, one eg. is in previous folder file, and
        //one eg. is this , you can create a abstract method of same name in class of reference (here base)
        b.func3();
    

        derived d=new derived();
        d.func();
        d.func1();
        d.func3();

      

    }
}
