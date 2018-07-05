package dp.pb.test.concurrent;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class BlkQTests {

	public static void main(String[] args) throws InterruptedException{
		 BlockingQueue<String> queue = new LinkedBlockingQueue<String>(10);
		 int x =67772222;
		 System.out.println(x);
	        Producer producer1 = new Producer(queue);
	        Producer producer2 = new Producer(queue);
	        Producer producer3 = new Producer(queue);
	        Consumer consumer = new Consumer(queue);
	 
	        // 借助Executors
	        ExecutorService service = Executors.newCachedThreadPool();
	        // 启动线程
	        service.execute(producer1);
	        service.execute(producer2);
	        service.execute(producer3);
	        service.execute(consumer);
	 
	        // 执行10s
	        Thread.sleep(10 * 1000);
	        producer1.stop();
	        producer2.stop();
	        producer3.stop();
	 
	        Thread.sleep(2000);
	        // 退出Executor
	        service.shutdown();
	    } 
}
