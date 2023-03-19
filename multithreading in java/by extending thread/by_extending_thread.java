class mythread extends Thread{
    @Override
    public void run(){
        int i=0;
        // while(i++<50){
            System.out.println("my thread is runnning");

        // }
    }
}
class mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        // while(i++<50){
            System.out.println("my thread2 is runnning");

        // }
    }
}

public class by_extending_thread{
    public static void main(String[] args) {
        System.out.println("hello");
        mythread obj1=new mythread();
        mythread2 obj2=new mythread2();

        // obj1.run();
        // obj2.run();
        obj1.start();  //here it create the new thread
        obj2.start();
        System.out.println("hello");  //but current thread is executing main method

        // In summary, start() creates a new thread and starts it, while run() runs the code of the thread in the current thread without creating a new thread.
        

        //here due to multithreading , at some time one function will execute and at some time second function will execute
    }
}