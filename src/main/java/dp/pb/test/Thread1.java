package dp.pb.test;

public class Thread1 implements Runnable {
	   Object lock;
	   public void run() {  
	       synchronized(lock){
	         System.out.println(lock);
	       }
	   }
	}