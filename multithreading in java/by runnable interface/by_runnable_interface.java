

class runnable1 implements Runnable
{
    public void run(){
        int i=0;
        while(i++<100){

            System.out.println("in runnable 1");
        }
    }
}
class runnable2 implements Runnable
{
    public void run(){
        int i=0;
        while(i++<100){
            System.out.println("in runnable 2");

        }
    }
}
public class by_runnable_interface{
    public static void main(String[] args) {
        runnable1 bullet1=new runnable1();
        runnable2 bullet2=new runnable2();

        Thread gun1=new Thread(bullet1);
        Thread gun2=new Thread(bullet2);

        gun1.start();
        gun2.start();
        
    }
}