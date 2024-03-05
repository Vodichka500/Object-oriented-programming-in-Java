public class customer {

    public static void main(String[] args) {
        Magazyn magazyn = new Magazyn();

        Thread producent = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                magazyn.produkuje(i);
            }
        });

        Thread konsument = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                magazyn.konsumuje();
            }
        });

        producent.start();
        konsument.start();
    }
}

class Magazyn {
    private boolean dostepneProdukty = false;

    public synchronized void produkuje(int numerProduktu) {
        System.out.println("Producent produkuje produkt nr " + numerProduktu);

        dostepneProdukty = true;
        notifyAll();

        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void konsumuje() {
        while (!dostepneProdukty) {
            try {
                System.out.println("Konsument czeka na dostępne produkty.");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Konsument konsumuje produkt.");
        dostepneProdukty = false;
        notifyAll();
    }
}
