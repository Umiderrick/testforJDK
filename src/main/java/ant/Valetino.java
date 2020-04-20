package ant;

import java.util.concurrent.atomic.AtomicInteger;

public class Valetino {

    public AtomicInteger inc = new AtomicInteger();
    private volatile int x = 0;

    public static void main(String[] args) {
        // ExecutorService executor = Executors.newFixedThreadPool(2);
        // executor.execute(command);
        final Valetino test = new Valetino();
        for (int i = 0; i < 100; i++) {
            new Thread() {
                public void run() {
                    for (int j = 0; j < 10000; j++) {
                        test.increase();
                        test.increase3();
                    }

                }

            }.start();
        }

        while (Thread.activeCount() > 1) // 保证前面的线程都执行完
            Thread.yield();
        System.out.println(test.x);
        System.out.println(test.inc);
    }

    public void increase() {
        x++;
    }

    public synchronized void increase2() {
        x++;
    }

    public void increase3() {
        inc.getAndIncrement();
    }
}
