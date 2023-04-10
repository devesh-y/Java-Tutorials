
import java.util.*;

public class array {
    public static void main(String[] args) 
    {
       
       //type 1
        int []students =new int[5];
        students[2]=45;
        //here student is a reference, stu and students are refering same location
        int []stu=students;
        System.out.println(students.length);
        stu[3]=56;
        for(int  x:stu)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int  x:students)
        {
            System.out.print(x+" ");
        }
        System.out.println();


        //type 2
        int []arr={433,34,3,324,332,32,4};
        stu=arr;     //now stu is referencing to arr
        //now no relation between stu and students
        for(int  x:stu)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        
        stu=new int[5];  //now stu is different array 
        //, no relation with arr
        stu[3]=55555;
        for(int  x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        for(int  x:stu)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        Arrays.sort(stu);           //sorting



        //multidimensional array

        int [][]hello={{34,34,34},{34,34,34}};
        System.out.println();
        System.out.println(hello[1][2]);


        //other type
        int arr2[][]=new int[5][5];
        arr2[2][3]=45;
                 
    }
}  