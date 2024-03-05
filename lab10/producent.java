import java.util.ArrayList;
import java.util.Random;

class Zavod implements Runnable {
    private ArrayList<Integer> sklad;

    public Zavod(ArrayList<Integer> sklad) {
        this.sklad = sklad;
    }

    @Override
    public void run() {
        int totalProduced = 0;

        while (totalProduced < 15) {
            synchronized (sklad) {
                if (sklad.size() < 5) {
                    int product = (int) (Math.random() * 10);
                    sklad.add(product);
                    System.out.println("Завод произвел товар " + product + ". Всего на складе: " + sklad.size());
                    sklad.notifyAll();
                    totalProduced++;
                } else {
                    try {
                        sklad.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                wait((int)Math.random() * 100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Pokupatel implements Runnable {
    private ArrayList<Integer> sklad;
    private int totalBought = 0;

    public Pokupatel(ArrayList<Integer> sklad) {
        this.sklad = sklad;
    }

    @Override
    public void run() {
        while (totalBought < 15) {
            synchronized (sklad) {
                if (sklad.isEmpty()) {
                    try {
                        System.out.println("Покупатель ждет товар на складе.");
                        sklad.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    int boughtProduct = sklad.remove(0);
                    System.out.println("Покупатель купил товар " + boughtProduct + ". Всего на складе: " + sklad.size());
                    sklad.notifyAll();
                    totalBought++;
                }
            }
            try {
                Thread.sleep((int) (Math.random() * 100)); // Подождать случайное количество времени перед следующей покупкой
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class producent {
    public static void main(String[] args) {
        ArrayList<Integer> sklad = new ArrayList<>();

        Zavod zavod = new Zavod(sklad);
        Pokupatel pokupatel = new Pokupatel(sklad);

        Thread zavodThread = new Thread(zavod);
        Thread pokupatelThread = new Thread(pokupatel);

        zavodThread.start();
        pokupatelThread.start();
    }
}
