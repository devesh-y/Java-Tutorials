class base1{
    int i=56;
    int j=56;
}
class base2{
    int i=56;
    int b=56;
}

//equal method will only check whether the reference of two variables is same or not 
//it wont check the object 
//we can override the equal method to do a different check
public class class_equal {
    public static void main(String[] args) {
        base1 b1=new base1();
        base2 b2=new base2();
        base1 b3=new base1();
        base1 b4=b1;
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(b1.equals(b4));
    }
}
//When you compare two ArrayLists using the .equals() method, it will compare the elements of both ArrayLists. If both ArrayLists have the same elements in the same order, it will return true.