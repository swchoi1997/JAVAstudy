package Thread;

// Thread 우선순위
public class ThreadEx8 {
    public static void main(String[] args) {
        ThreadEx8_1 threadEx8_1 = new ThreadEx8_1();
        ThreadEx8_2 threadEx8_2 = new ThreadEx8_2();

        threadEx8_2.setPriority(7);
        System.out.println("threadEx8_1 : " + threadEx8_1.getPriority());
        System.out.println("threadEx8_2 : " + threadEx8_2.getPriority());

        threadEx8_1.start();
        threadEx8_2.start();
    }
}

class ThreadEx8_1 extends Thread{
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("-");
            for (int x = 0; x < 10000000; x++);
        }
    }
}


class ThreadEx8_2 extends Thread{
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.printf("|");
            for (int x = 0; x < 10000000; x++);
        }
    }
}