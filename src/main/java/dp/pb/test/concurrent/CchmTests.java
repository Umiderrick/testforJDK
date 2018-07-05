package dp.pb.test.concurrent;
public class CchmTests {

	public static void main(String[] args) {
//
//		       Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
//		       int tt=13;
//		       long begin1 = System.currentTimeMillis();
//		       for(int i=0; i<1000000; i++){
//		           tt = Math.abs(tt*(tt-i)-119);
//		           hashmap.put(tt, tt);
//		       }  
//		       System.out.println("time="+(System.currentTimeMillis() - begin1)+"ms.");    
//		       
//		       
		       long begin1 = System.currentTimeMillis();
		       for(int i=0; i<1000000; i++){
		    	  Object o =new Object();
		    	  o.getClass();
		    	  o.toString();
		       }  
		       System.out.println("time="+(System.currentTimeMillis() - begin1)+"ms.");        
		    }

}
