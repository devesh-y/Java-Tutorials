class base{
    static int x=53;
    base(){
        x=56;
    }
}
public class static_member {
    public static void main(String[] args) {
       
        base.x=34;
        System.out.println(base.x);
        base b=new base();
        System.out.println(base.x);
        b.x=45;
        System.out.println(base.x);
    }
}
