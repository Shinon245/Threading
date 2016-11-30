package threading;


class Serve implements Runnable {
   private String customer;
   private Thread C;
   
   Serve( String name) {
      customer = name;
      System.out.println("Serving " +  customer );
   }
   
   public void run() {
        
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
