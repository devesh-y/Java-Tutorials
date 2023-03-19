import java.util.*;

public class date_ {
    public static void main(String[] args) {
        Date todayDate=new Date();
        System.out.println(todayDate);


        System.out.println(String.format("%tc",new Date()));
        System.out.println(String.format("%tr",new Date()));
        System.out.println(String.format("%tA",new Date()));
        System.out.println(String.format("%tB",new Date()));
        System.out.println(String.format("%tC",new Date()));
        System.out.println(String.format("%tD",new Date()));
        System.out.println(String.format("%td",new Date()));
        

        // Calendar cal =new Calendar();   //it does not work because Calender is an abstract class

        //instead we use 
  
        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();
        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);
        System.out.println("new hour " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);
        System.out.println("add 35 days " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("roll 35 days " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("set to 1 " + c.getTime());
    }
}
