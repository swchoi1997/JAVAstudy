package Thread;

public class ThreadEx5 {
    static long startTime = 0;
    public static void main(String[] args) {
        Thread5_1 thread5_1 = new Thread5_1();
        thread5_1.start();

        startTime = System.currentTimeMillis();

        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("-"));
        }
        System.out.println("소요시간1" + (System.currentTimeMillis() - startTime));


    }
}

class Thread5_1 extends Thread{
    public void run(){
        for (int i = 0; i < 300; i++) {
            System.out.printf("%s", new String("|"));
        }
        System.out.println("소요시간2" + (System.currentTimeMillis() - ThreadEx5.startTime));
    }
}
