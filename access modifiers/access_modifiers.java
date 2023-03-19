//Default – No keyword required-used---> only within the same package(take it as public but with same package).
// Private
// Protected--they can be inherited and can be called directly
// Public

//4 modifiers


class member{
    private int a;
    private int b;
    protected int c=67;
    void printdetails(){
        System.out.println(a+ " "+ b);
    }
    void setdetails(int a,int b){
        this.a=a;
        this.b=b;
    }
    protected void print2(){
        System.out.println(a+ " "+ b);
    }
}

public class access_modifiers  {
    public static void main(String[] args) {
        member obj=new member();
        obj.setdetails(45,34);
        obj.printdetails();
        System.out.println(obj.c);
        obj.print2();
        
    
    }
}
