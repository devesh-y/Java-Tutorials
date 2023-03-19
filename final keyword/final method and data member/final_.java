//final data member can be assigned values by 3 ways\
//1. at the time of declaration
//2. declare first then assign in all constructor
//3. declare first then assign in initiliser block or static block

abstract class base{
    final int x;  
   
    base(){
        System.out.println("in constructor");
        x=56;
    }

    //it runs before the constructor and works each time when object created
    //this is an initializer block
    {
        System.out.println("in initializer block");
        // x=56;
    }

    final void func()   //final methods cannot be override
    {
        System.out.println("base");
    }
}

class derived extends base{
    // void func(){       //cannot override
    //     System.out.println("derived");
    // }
}
public class final_ {
    public static void main(String[] args) {
        base b=new derived();
        b.func();
    }

}
