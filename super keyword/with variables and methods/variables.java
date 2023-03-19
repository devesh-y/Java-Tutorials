class base{
    int hello=5;
    void func(){
        System.out.println("in base");
    }
}
class derived extends base{
    void display(){
        System.out.println(super.hello);
        super.func();
    }
}
public class variables {
    public static void main(String[] args) {
        derived d=new derived();
        d.display();
        
    }
}
