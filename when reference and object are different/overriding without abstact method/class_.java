class base {
    base()
    {
        System.out.println("base constructor");
    }
    void func(){  
        System.out.println("in base");
    }
    void func1(){
        System.out.println("in base");
    }
    
}
class derived extends base{
    derived(){
        System.out.println("derived constructor");
    }
    void func1(){                          
        System.out.println("in derived");
    }
}

public class class_ {
    public static void main(String[] args) {       
       base d=new derived();

       d.func1();    //here at runtime the function of object class is used not of reference 
       d.func();

    }
}
