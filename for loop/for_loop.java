import java.util.ArrayList;

public class for_loop {
    public static void main(String[] args) {
        float []arr={34.343f,3.34f,434.4564f,343.343f,4.454f,3.45f};
        for(float i: arr){
            System.out.print(i+" ");
        
        }

        ArrayList<Integer> ar=new ArrayList<>();
        ar.add(34);
        ar.add(34);
        ar.add(34);
        ar.add(34);
        ar.add(34);
        ar.forEach( x->{
            System.out.println(x);
        } );
    }
}
