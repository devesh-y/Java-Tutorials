

class base{
    int i,j;
   
    base(int a,int b){
        i=a;
        j=b;
        System.out.println("in base");
    }
}
class derived extends base{
    derived(){
        //you can call any constructor
        super(4,5);    //this line must be at the top in the definition
        System.out.println("in derived");
        
    }

}

public class cons {
    public static void main(String[] args) {

        derived d=new derived();//we know whenever the subclass object is created, the no argument constructor of super class called
        //but here we changed that with help of super
    }
}
