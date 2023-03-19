//java dont suppport multiple inheritance this way 
//we have to use the concept of interfaces 

class a{
    void burn(){
        System.out.println("in a");
    }
}
class b{
    void burn(){
        System.out.println("in b");
    }
}
class c extends a,b {
    void burn(){
        System.out.println("in c");
    }
}
public class multiple_inheritance {
    public static void main(String[] args) {
        c obj=new c();
        obj.burn();
    }
}
