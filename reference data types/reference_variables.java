//Strings, arrays , object are reference data type in java

public class reference_variables {
    public static void main(String[] args) {
        //in java strings are immutable, which means once you create a string , you cannot change it
        String s="devesh"; // s is a variable which reference to a string object "devesh"

        //here s is stored in stack
        s=new String("dev");
        //in these above lines you are not changing the strings,you are reassigning the value of the varible s to refer to a different string object


        //the string "devesh" is creatd and the variable s is assigned to reference it
        //when the s is changed to reference a new string object "dev"
        //the original string object "devesh" still exists in memory but the variable s is no longer pointing to it

        //so the string itself is immuatable 
        // only s can be changed to refer a different string object
     

    }
}
