
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> cws=new ArrayList<Integer>(Collections.nCopies(5, 45));

        ArrayList<Integer> cars=new ArrayList<Integer>(7);
        //in java it does not care whether you define a size of arraylist , its a dynamic array
        System.out.println(cars);
        System.out.println(cars.size());
        for(int i=0;i<5;i++){
            cars.add(i*10);
        }
        System.out.println(cars);
        cars.remove(3); //remove the element at index 3
        System.out.println(cars);

        cars.add(2,34);
        System.out.println(cars);

        System.out.println("the third index element is "+cars.get(3));

        //set the index by some value
        cars.set(2,45);
        System.out.println(cars);

        cars.remove(2);
        System.out.println(cars);
        System.out.println(cars.contains(45));
        System.out.println(cars.indexOf(45));  //if not available then -1


        System.out.println(cars.isEmpty());
        
        ArrayList<Integer> car2=cars;  //they are reference to same thing
        car2.set(0, 5500);//one thing will change another
        cars.set(1, 550);
        System.out.println(car2+"\n"+cars);

        Collections.sort(cars);    //sorting
       
        System.out.println(cars);

        ArrayList<Integer> b2=new ArrayList<Integer>(cars);
        System.out.println(b2);
        //or you can use 
        b2.addAll(cars);   //you can add a index here also
        b2.addAll(2,cars);   //you can add a index here also


        // b2.clear();  //remove all elements

        // the remove method is overloaded 
        ArrayList<String> str=new ArrayList<String>();
        str.add("hello");
        str.add("my");
        System.out.println(str);
        
        str.remove(1);  //overloaded remove method
        str.remove("hello");
        System.out.println(str);



        ArrayList<Integer> rr=new ArrayList<Integer>();
        rr.add(2);
        rr.add(2);
        rr.add(2);
        rr.add(2);
        
        ArrayList<Integer> rr2=new ArrayList<Integer>();
        rr2.add(2);

        rr.removeAll(rr2);  //remove all occurences of rr2 in rr
        System.out.println(rr);

        rr.clear();
        rr.add(22);
        rr.add(22);
        rr.add(22);
        rr.add(22);


        rr.removeIf( x-> x%3==0);   //this gives the condition to delete if



        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        ArrayList<Integer> al2=new ArrayList<>(al);
        System.out.println("checking equality");

        System.out.println(al.equals(al2));

        for(int x: al){
            System.out.print(x+ " ");
        }

  
        Integer[] arr =new Integer[al.size()];
        al.toArray(arr);       //important
        for(Integer x:arr){
            System.out.println(x);
        }



    
        
            
    }
}
