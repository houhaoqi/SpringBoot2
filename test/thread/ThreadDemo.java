package thread;

/**
 * @author haoqi
 * @Date 2022/3/28 - 20:22
 */

public class ThreadDemo {
   /*
   什么是线程死锁
    百度百科：死锁是指两个或两个以上的进程（线程）在执行过程中，
    由于竞争资源或者由于彼此通信而造成的一种阻塞的现象，若无外力作用，它们都将无法推进下去。
    此时称系统处于死锁状态或系统产生了死锁，这些永远在互相等待的进程（线程）称为死锁进程（线程）。
    线程A 占用资源1 等待资源2
    线程B 占用资源2 等待资源1
    */
    // 准备两个资源1，2
    private static Object resource1 = new Object();
    private static Object resource2 = new Object();

    public static void main(String[] args) {
        //创建两个线程A，B
        new Thread(() -> {
            synchronized (resource1){
                System.out.println(Thread.currentThread() + "使用资源1");
                try {
                    Thread.sleep(1000); //休眠1s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "等待 资源2");
                synchronized (resource2){
                    System.out.println(Thread.currentThread() + "使用资源2");
                }
            }
        },"线程1").start();//启动

        new Thread(() -> {
            synchronized (resource1){ //修改resource1 打破等待循环即可解除死锁
                System.out.println(Thread.currentThread() + "使用资源2");
                try {
                    Thread.sleep(1000); //1s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "等待 资源1");
                synchronized (resource2){ //同理这里需要等待resource2
                    System.out.println(Thread.currentThread() + "使用资源1");
                }
            }
        },"线程2").start();

        new Thread(() -> {
            synchronized (resource1){ //修改resource1 打破等待循环即可解除死锁
                System.out.println(Thread.currentThread() + "使用资源2");
                try {
                    Thread.sleep(1000); //1s
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread() + "等待 资源1");
                synchronized (resource2){ //同理这里需要等待resource2
                    System.out.println(Thread.currentThread() + "使用资源1");
                }
            }
        },"线程3").start();

    }


}
