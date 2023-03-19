

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    private Day(){
        System.out.println(this.toString());
    }
    public void dayinfo(){
        System.out.println("this is a method of enum");
    }
}

public class enum_ {
    public static void main(String[] args) {
        Day c1 = Day.SUNDAY;
        System.out.println(c1);
        c1.dayinfo();
       
        Day []a=Day.values();
        for(Day x: a){
            System.out.println(x.ordinal());  //it provide the index
            System.out.println(x);
        }

        

        
        
    }
}
