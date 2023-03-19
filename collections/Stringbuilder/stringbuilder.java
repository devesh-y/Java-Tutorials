import java.sql.Array;
import java.util.Collection;
import java.util.*;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello ");
        str.append("hi");
        str.append('i');
        System.out.println(str);
        System.out.println(str.toString());
        String s="sdf";
       

        System.out.println(str.charAt(0));
        System.out.println((int)str.charAt(0));
        System.out.println(str.codePointAt(0));
        System.out.println(str.capacity());
        System.out.println(str.length());
        System.out.println(str.indexOf("zz"));
        System.out.println(str.lastIndexOf("df"));
        str.reverse();
        String ss=str.toString();
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
        char []my=ssss.toCharArray();
        Arrays.sort(my);


    }
}
