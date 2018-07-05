package dp.pb.test;

import java.util.concurrent.atomic.AtomicReference;

public class SingletonXX {
	    private static AtomicReference<SingletonXX> INSTANCE = new AtomicReference();
	    private SingletonXX() {
	        System.out.println("init----");
	    }
	    public static SingletonXX getInstance(){
	        while (INSTANCE.get()==null){
	            INSTANCE.compareAndSet(null,new SingletonXX());
	        }
	        return INSTANCE.get();
	    }

	    public void sayHello(){
	        System.out.println("hello!");
	    }
}
