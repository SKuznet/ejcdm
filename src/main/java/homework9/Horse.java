package homework9;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Horse implements Runnable {
    private static int counter;
    private static CyclicBarrier cyclicBarrier;
    private static Random random = new Random(42);
    private static int dispersion = random.nextInt(20);
    private static int maxSpeed = random.nextInt(60) + dispersion;
    private String name;
    private final int id = counter++;
    private int strides;

    public Horse(CyclicBarrier cyclicBarrier, String name) {
        this.cyclicBarrier = cyclicBarrier;
        this.name = name;
    }

    public synchronized int getStrides() {
        return strides;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                synchronized (this) {
                    int speed = random.nextInt(80);
                    if (speed > maxSpeed){
                        speed = maxSpeed;
                    }
                    strides += speed;
                }
                cyclicBarrier.await();
            }
        } catch (InterruptedException e) {
        } catch (BrokenBarrierException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
