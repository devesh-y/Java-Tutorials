
//static blocks execute one time only when class is first loaded
//and there is no need to create objects for execution of static block



//let say there is another class in which static block is used
//than in that case when it try to access the class things(may be static member,function ) , anything, or like when we create objects , the constructor is also a part of class ,so the static block will execute

public class static_blocks {
    static int a=76;
    int b;
    static {
        System.out.println("the value of a is "+a );
    
        a=45; //you can access the static member and function only
       // b=34;  //cannot use non static member
       System.out.println("the value of a is "+a );
    }
    public static void main(String[] args) {
        
    }
}
