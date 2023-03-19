class MyThread extends Thread {
  public void run() {
      for (int i = 0; i < 10; i++) {
          System.out.println("Child Thread: " + i);
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
  }
}

public class thread_joining {
  public static void main(String[] args) {
      MyThread thread = new MyThread();
      thread.start();

      for (int i = 0; i < 10; i++) {
          System.out.println("Main Thread: " + i);
          try {
              Thread.sleep(50);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }

      try {
          thread.join();    //this method will make the program to wait until the mytread thread finishes 
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      System.out.println("Main thread is finished!");
  }
}