package dp.pb.test.concurrent;
import java.util.Random;
import java.util.concurrent.*;

public class ForkTests {

	
	
	public static void main(String[] args) throws Exception {
	    // 创建随机数组成的数组:
//	    long[] array = new long[400];
//	    fillRandom(array);
//	    ThreadLocal<String> stringThreadLocal =ThreadLocal.withInitial(()->"sssss");
//		String s = stringThreadLocal.get();
//
//		ExecutorService executorService = Executors.newCachedThreadPool();
//		executorService.execute((() -> System.err.println("qqqqqq"),Integer.max(111,2222)))
//		System.err.println(s);
//		// fork/join task:
//	    ForkJoinPool fjp = new ForkJoinPool(4); // 最大并发数4
//	    ForkJoinTask<Long> task = new SumTask(array, 0, array.length);
	    long startTime = System.currentTimeMillis();
	    System.err.println(startTime);
	    long a =startTime>>>32;
		System.err.println(a);
	    long hash = startTime ^ a;
	    System.err.println(hash);
//	    Long result = fjp.invoke(task);
//	    long endTime = System.currentTimeMillis();
//	    System.out.println("Fork/join sum: " + result + " in " + (endTime - startTime) + " ms.");
	}

	private static void fillRandom(long[] array) {
		Random rd =new Random();
		for(int i =0;i<400;i++){
			long nextLong = rd.nextLong();
			array[i] =nextLong;
		}
		
		
	}

}
