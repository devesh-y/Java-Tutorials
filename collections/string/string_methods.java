public class string_methods {
    public static void main(String[] args) {
        //objects of string class are immutable 
        //that means they cannot be modified


        String str="devesh";
        str="dev";
        str=new String("devesh");

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
        System.out.println(s1.indexOf("ev",3));//it will start checking from index 3
        System.out.println(s1.lastIndexOf("e"));
        System.out.println(s1.equals("ok"));
    

    }
}
