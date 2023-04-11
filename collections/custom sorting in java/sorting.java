import java.util.*;
class StudentData implements Comparable<StudentData> {
  
    String name;
    int marks;
  
    StudentData(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
  
    // overriding method to sort
    // the student data
    public int compareTo(StudentData sd) //think argument as previous value
    {
        return this.marks - sd.marks;
    }
}
public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);


        //opposite of c++

        //method 1

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;  
            }
        });
        System.out.println(list);

        //method 2

        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        //method 3

        list.sort( (a,b)-> b-a );


        System.out.println(list);





        //this below is another type
        ArrayList<StudentData> listt= new ArrayList<StudentData>();
  
        // Inserting data
        listt.add(new StudentData("Ram", 98));
        listt.add(new StudentData("Shyam", 84));
        listt.add(new StudentData("Lokesh", 90));
  
        Collections.sort(listt);
  
        // Displaying data
        for (StudentData sd : listt)
            System.out.println(sd.name + " " + sd.marks);






    }
}
