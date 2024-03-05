import java.util.InputMismatchException;
import java.util.Scanner;
import java.math.MathContext;
public class Main {
    public static void main(String[] args) {
       // dziel(10);
       // znowDzielenie(10);
       // kalkulator();
       // liczba();
        zad63();
    }

    //ZADANIA LABORATORYJNE
    public static void dziel(int x) {
        Scanner skaner = new Scanner(System.in);
        try {
            int y = skaner.nextInt();
            System.out.println("Twój wynik to: " + x / y);
        } catch (ArithmeticException e) {
            System.err.println("Podaj poprawny dzielnik");
            dziel(x);
        } catch(InputMismatchException e){
            System.err.println("Podaj poprawny dzielnik");
            dziel(x);
        }
    }
    public static void znowDzielenie(int x) throws ArithmeticException {
        Scanner skaner = new Scanner(System.in);
        int y = skaner.nextInt();
        if (y == 0)
            throw new ArithmeticException("Podaj poprawny mianownik");
        else
            System.out.println("Twój wynik to: " + x / y);
    }

    // ZADANIE 6.1
    public static void kalkulator(){
        Scanner scanner = new Scanner(System.in);
        double wynik = 0;
        int wybor = 0;

        System.out.println("Podaj liczbe: ");
        try {
            wynik = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.err.println("Podaj licbe!");
            kalkulator();
        }

        while(wybor != 7){

            System.out.println("Jaka operacja?\n1: +\n2: -\n3 *\n4 /\n5 sqrt\n6 pow\n7 wynik(koniec)");
            wybor = scanner.nextInt();
            if(wybor == 1){
                System.out.println("Podaj licbe");
                double temp = 0;
                try {
                    temp = scanner.nextDouble();
                } catch (InputMismatchException e){
                    System.err.println("Error: To nie jest liczba \nSproboj ponownie");
                    kalkulator();
                }
                wynik = wynik + temp;
            }
            if(wybor == 2){
                System.out.println("Podaj licbe");
                double temp = 0;
                try {
                    temp = scanner.nextDouble();
                } catch (InputMismatchException e){
                    System.err.println("Error: To nie jest liczba \nSproboj ponownie");
                    kalkulator();
                }
                wynik = wynik - temp;
            }
            if(wybor == 3){
                System.out.println("Podaj licbe");
                double temp = 0;
                try {
                    temp = scanner.nextDouble();
                } catch (InputMismatchException e){
                    System.err.println("Error: To nie jest liczba \nSproboj ponownie");
                    kalkulator();
                }
                wynik = wynik * temp;
            }
            if(wybor == 4){
                System.out.println("Podaj licbe");
                double temp = 0;
                try {
                    temp = scanner.nextDouble();
                    if(temp == 0) {
                        throw new ArithmeticException("Dzielenie przez 0 nie jest mozliwe");
                    }
                    wynik = wynik/temp;
                } catch (InputMismatchException e){
                    System.err.println("Error: To nie jest liczba \nSproboj ponownie");
                    kalkulator();
                }

            }
            if(wybor == 5){

                try {
                    wynik = Math.sqrt(wynik);
                    System.out.println("Pirwiastek = "+wynik);
                    } catch (InputMismatchException e){
                        System.err.println("Error: To nie jest liczba \nSproboj ponownie");
                        kalkulator();
                    } catch (Exception e){
                        System.err.println("Pierwiastkowanie liczb ujemnych niemozliwe.\nSproboj ponownie");
                        kalkulator();
                }


            }
            if(wybor == 6){
                System.out.println("Podaj stopien");
                double temp = 0;
                try {
                    temp = scanner.nextDouble();
                    wynik = Math.pow(wynik, temp);
                } catch (InputMismatchException e){
                    System.err.println("Error: To nie jest liczba \nSproboj ponownie");
                    kalkulator();
                } catch (ArithmeticException e){
                    System.err.println("Dzielenie przez 0 niemozliwe.\nSproboj ponownie");
                    kalkulator();
                }
            }
            if(wybor == 7){
                System.out.println("Koniec");
                System.out.println("Wynik = " + wynik);
            }

        }
    }
    public static void liczba(){
        Scanner sc = new Scanner(System.in);
        double liczba, liczba1, rezult;
        int il;

        try{
            liczba = sc.nextDouble();
            il = (int)liczba;
            liczba1 = liczba - (double)il;
            rezult = ((double)il)/(liczba1);


            System.out.println("Liczba wejsciowa: "+liczba+"\nCecha: "+il+"\nMantysa: "+liczba1+"\nIloraz: "+rezult);
        }catch (InputMismatchException e){
            System.err.println("To nie jest liczba");
            liczba();
        }catch (ArithmeticException e){
            System.err.println("Bląd arytmetyczny");
            liczba();
        }
    }
    public static void zad63(){
        Scanner sc = new Scanner(System.in);

        try{

            int liczba = sc.nextInt();
            int suma = 0;
            if(liczba>=99 && liczba<=999){
                do {
                    suma = suma + (liczba%10)*(liczba%10);
                    liczba = liczba/10;
                }while (liczba != 0);
                System.out.println("Suma kwadratow = "+suma);
            }
            else{
                System.out.println("Liczba nie jest w zakresie");
            }
        }catch (InputMismatchException e){
            System.err.println("Podaj liczbe!");
            zad63();
        }

    }
}