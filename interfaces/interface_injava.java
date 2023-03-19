interface inter{
    int x=6;     //data members are static and final and pubic by (default and only )


    //methods in interface are public and abstract by default
    public abstract void func();  //its ok if you dont write absract and public here
    //it by default mean abstract due to interface are pure abstract
}
interface inter2{
    
    void func();
}
class c1 implements inter,inter2{
    
    public void func(){      //you have to strictly use public here 
        System.out.println("sdfs");
    }
   
}


public class interface_injava{
    public static void main(String[] args) {
        c1 obj=new c1();
        obj.func();
     
        System.out.println(obj.x);
        System.out.println(c1.x);
        
    }
    
}
