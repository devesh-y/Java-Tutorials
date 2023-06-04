public class string_methods {
    public static void main(String[] args) {
        //objects of string class are immutable 
        //that means they cannot be modified

        String str="devesh";   //here string literal is used to initialize
        str="dev";
        str=new String("devesh");  //here new keyword is used to initialize a new string
        String str34=45+ "Dsfsdf";
        System.out.println(str34);
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        String s1="   devesh  ";
        System.out.println(s1.trim());//it will remove the spaces before and after the string
        System.out.println(s1.substring(5,7));//2nd argumet not included
        System.out.println(s1.replace('e', '4'));
        System.out.println(s1.replace("ev", "56"));
        System.out.println(s1.charAt(6));
        System.out.println(s1.startsWith("  "));//check whether starts with given prefix
        System.out.println(s1.endsWith("h  "));
        System.out.println(s1.indexOf("ev"));
        System.out.println(s1.indexOf('d',3));//it will start checking from index 3
        System.out.println(s1.indexOf("df",3));//it will start checking from index 3
        System.out.println(s1.lastIndexOf("e"));
        String s2="ok";
        System.out.println(s2.equals("ok"));
    

        String aa="first/second/third";
        String []aa2=aa.split("/");
        for(String s: aa2){
            System.out.println(s);
        }

        //important
        String str1="sdfsf";   //store in string pool
        String str2="sdfsf";   //here str1 and str2 refer to same memory 
        //because they are initialize by string literals
        System.out.println(str1.equals(str2)); //check for same content
        System.out.println(str1==str2);
        str2=new String("sdfsf");    //store in heap
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);





    }
}
