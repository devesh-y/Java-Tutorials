class base {
    int x;

    base() {
        System.out.println("in base");
    }

    base(int x) {
        // this();     //it can be used in a constructor parenthesis only
        
        //it refers to the constructor of same class
        //it should be the first line in construcotr
        //you can call other argument constructor also
        System.out.println("constructor with value " + x);
    }

    int getx() {
        return x;
    }
}

class derived extends base {
    int y;

    derived(int p, int q) {
        System.out.println("in derived");
    }
}

class derived1 extends base {
    int y;

    derived1() {
        // calling any particular base class constructor through super
        super(65);// here even you dont need the zeroth argument constructor also, because you are
                  // calling the constructor of your choice
        // if not using super than you need both constructors to be present in base and
        // derived
        System.out.println("in derived1");
    }
}

public class inheritance {
    public static void main(String[] args) {
        base obj = new base();
        derived obj2 = new derived(99, 88);
        derived1 obj3 = new derived1();

    }
}
