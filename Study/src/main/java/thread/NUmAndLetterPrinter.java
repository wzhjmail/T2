package thread;

/**
 * @ClassName NUmAndLetterPrinter
 * @Description
 * @Author wzj
 * @Date 2020/12/23 11:35
 **/

public class NUmAndLetterPrinter {

    private static char c = 'A';

    private static int i = 0;

    static final Object lock = new Object();

    public static void main(String[] args) {
        new Thread(() -> printer(), "numThread").start();
        new Thread(() -> printer(), "letterThread").start();
    }

    private static void printer() {
        synchronized (lock) {
            for (int i = 0; i < 26; i++) {
                if (Thread.currentThread().getName() == "numThread") {
                    //打印数字1-26
                    System.out.print((i + 1));
                    //唤醒其他在等待的线程
                    lock.notifyAll();
                    try {
                        //让当前线程释放资源，进入wait状态
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else if (Thread.currentThread().getName() == "letterThread") {
                    // 打印字母A_Z
                    System.out.print((char) ('A' + i));
                    //唤醒其他在等待的线程
                    lock.notifyAll();
                    try {
                        //让当前线程释放资源，进入wait状态
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            lock.notifyAll();
        }
    }
}
