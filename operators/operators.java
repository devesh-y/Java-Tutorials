import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(343);
        al.add(343);
        al.add(343);
        al.add(343);
        ArrayList<Integer> al2=new ArrayList<>(al);

        System.out.println(al==al2);
        // the == operator only check if both objects reference to same thing or not


        int x=45;
        int y=45;
        System.out.println(x==y);   //but here they are primitive data types not objects
        



    }
}
