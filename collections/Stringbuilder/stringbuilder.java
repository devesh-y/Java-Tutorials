import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello ");
        str.append("hi");
        str.append('i');
        System.out.println(str);
    

        //important
        System.out.println(str.toString());


    
        System.out.println(str.charAt(0));
        System.out.println((int)str.charAt(0));
        System.out.println(str.codePointAt(0));
        System.out.println(str.capacity());
        System.out.println(str.length());
        System.out.println(str.indexOf("zz"));
        System.out.println(str.lastIndexOf("df"));

        str.reverse();      //reverse the stringbuilder


        str.insert(0, "devesh");
        System.out.println(str);

        str.delete(0, 3);//2nd not included
        System.out.println(str);
        str.replace(0, 3, "dev");
        System.out.println(str);
        
        str.setCharAt(0, 'f');
    
        StringBuilder sss=new StringBuilder(str);
        StringBuilder s1=new StringBuilder(str.substring(0, 5));  
    

        str.setLength(0); 


        String ssss=new String(str); 
        StringBuilder ss2=new StringBuilder(ssss);
    



        //you cannot use the enhanced for loop in string data type
        //you have to convert it into character array

        
        char []my=ssss.toCharArray(); //this method not for stringbuilder
        for(char ch:my){
            System.out.print(ch+" ");
        }
        Arrays.sort(my);   //sorting      this is the only way
        

        StringBuilder t1=new StringBuilder("dsfsfs");
        StringBuilder t2=new StringBuilder("dsfsfs");
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));  //check for same object in memory just like == operator


        //so for checking if the stringbuilders are equal 
        //you have to convert them into string objects
        

    
       
    }
}
