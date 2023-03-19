class base{
    int x;
    static int y=56;
    base(){
        System.out.println("base constructor");
    }
    void func(int x){
        System.out.println("base func argument");
    }
    void func(){
        System.out.println("in base func");
    }
    
}
class derived extends base{
    
    derived(){
        System.out.println("derived constructor");
    }
    
    void func(){
        System.out.println("in derived");
    }
}

public class method_overriding {
    public static void main(String[] args) {
        base b=new derived();
   
        System.out.println(b.x);


        b.func(); //override
        b.func(23);
        System.out.println(b.y);
        System.out.println(derived.y);


    }

}