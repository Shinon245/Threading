package threading;


class Serve implements Runnable {
   private String customer;
   private Thread C;
   
   Serve( String name) {
      customer = name;
      System.out.println("Serving " +  customer );
   }
   
   public void run() {
      System.out.println(customer + " is drinking" );
      try {
         for(int i = 0; i < 6; i++) {
            System.out.println(customer + " drunk level is: " + (i*2));
            // Let the thread sleep for a while.
            Thread.sleep(300);
         }
      }catch (InterruptedException e) {
         System.out.println("Thread " +  customer + " interrupted.");
   }
      System.out.println(customer + " kicked out.");
   }
   
   public void start () {
      System.out.println("Served " +  customer );
      if (C == null) {
         C = new Thread (this, customer);
         C.start ();
      }
   }
}

public class Threading {

   public static void main(String args[]) {
      Serve C1 = new Serve("Jane");
      C1.start();
      
      Serve C2 = new Serve("Bob");
      C2.start();
   }   
}
