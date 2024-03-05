import java.util.Random;

class  Watek extends Thread{
    private Random random = new Random();
    public int losuj(){
        int x  = random.nextInt(101);
        return x;
    }
    public void run(){
        for(int i = 0; i<5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + losuj());
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Watek watek = new Watek();


        // Tworzenie i uruchamianie wątków
        Thread watek1 = new Thread(watek);
        Thread watek2 = new Thread(watek);

        watek1.start();
        watek2.start();
    }
}