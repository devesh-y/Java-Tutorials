class base{
    int y=34;
    static int x=5;

}
public class final_objects {
    public static void main(String[] args) {
        final base obj=new base();
        obj.y=54;
        base.x=55;
        // object members can be changed
        //but object reassignment not possible

        base obj2=new base();
       // obj=obj2;     //this thing is not possible
    }
}
