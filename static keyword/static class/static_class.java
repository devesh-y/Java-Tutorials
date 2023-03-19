class base{
    static{
        //here this is not the main class , so it will load when you try to access static items or create a object of this class
        System.out.println("static block in base");
    }
    static class nested{
        static{  //here this is a nested static class
            //it will load only when you create a object of it
            System.out.println("nested static block");
        }
        void print(){
            System.out.println("inside nested");
        }
    }
    //non static inner class
    class nested2{
        static int cc=func();
        nested2(){ //constructor will run after the static block and members , order does not matter for constructor
            System.out.println("nested2 constructor");
        }
        static {
            System.out.println("static block in nested2");
        }
        static int func(){
            System.out.println("func function called");
            return 20;
        }
        void print(){
            System.out.println("inside nested2");
        }
    }

}

public class static_class {

    public static void main(String[] args) {
        base.nested obj1=new base.nested(); //for creating static nested class
        obj1.print();



        base obj2=new base();
        base.nested2 obj3=obj2.new nested2(); //for creating non static nested class
        obj3.print();

        //this above can be done by 
        // base.nested2 obj4=new base().new nested2();
        // obj4.print();


        
    }
}