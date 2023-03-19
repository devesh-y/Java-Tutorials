class employee{
    int a;
    String v;
    void printdetails(){
        System.out.println(a+ " "+v);
    }
}
public class class_ {
    public static void make(){
        System.out.println("dsfsd");
    }
    public static void main(String[] args) {
        employee obj=new employee();
        obj.a=56;
        obj.v="sfsd";
        obj.printdetails();
        make();
        employee obj2=obj;//obj2 is refering to obj , its not  a copy of other obj
        obj2.printdetails();

        obj2=new employee(); //here we create another object 
        obj2=obj;    //but obj2 is refering to obj
        obj.a=5;    //so both are refering to one place 
        //on changing to one thing will change another
        obj2.printdetails();  
        obj.printdetails();

        employee bb=new employee();
        System.out.println(bb.equals(obj));
        System.out.println(bb.getClass());
        System.out.println(bb.hashCode());
        System.out.println(bb.toString()); 
    }
}