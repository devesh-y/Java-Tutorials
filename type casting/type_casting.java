
class base{
    int x=56;
    void func(){
        System.out.println("in base");
    }
}
class derived extends base{
    int y=46;
    void func(){
        System.out.println("in derived");
    }
}
public class type_casting {
    public static void main(String[] args) {
        base b=new derived();//can access only base members and function
        b.func();
       


        derived d=(derived)b; //now will access derived member and function
        System.out.println(d.y);
    }
}
