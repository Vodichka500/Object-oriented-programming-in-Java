import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("Zadanie 1\n");

        zadanie1('a', "Ala ma kota");
        zadanie1('x', "Ala ma kota");

        System.out.println("\nZadanie 2\n");

        zadanie2("Ala ma 3 kota");
        zadanie2("ala ma 222 kota");

        System.out.println("\nZadanie 3\n");
        //zadanie3();

        System.out.println("\nZadanie 4\n");
        //zadanie4();

        System.out.println("\nZadanie 5\n");
        zadanie5();

    }
    static void zadanie1 (char a, String b) {
        int i = 0;
        int counter = 0;
        while(i<b.length())
        {
            if(b.charAt(i) == a)
            {
                counter++;
            }
            i++;
        }
        if(counter != 0)
        {
            System.out.println("Znak \'"+a+"\' wystepuje w ciagu \""+b+"\" "+counter+" raz(y)");
        }
        else {
            System.out.println("Znak \'"+a+"\' nie wystepuje w ciagu \""+b+"\"");
        }
    }
    static void zadanie2(String a) {
        int i = 0;
        int counter = 0;
        while (i<a.length())
        {
            if(a.charAt(i)>'A' && a.charAt(i)<'Z')
            {
                continue;
            }
            else
            {
                counter+=(int)a.charAt(i);
            }
            i++;
        }
        System.out.println("Suma kodow ASCI = "+counter);
    }
    static void zadanie3() {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(i<33 || i>126)
        {
            System.out.println("Podaj liczbe w zakresie od 33 do 126");
            i = sc.nextInt();
            if(i<33 || i>126) {
                System.out.println("Error; Sproboj ponownie");
            }
            else {
                continue;
            }

        }
        char a = (char) i;
        System.out.println("Liczba "+i+" odpowiada znaku \"" +a+"\" w kodach ASCI");
    }
    static void zadanie4(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz:\n1-zwrocic tekst\n2-zaszyfrowac tekst\n3-deszyfrowac tekst\n4-sprawdzic na Polindrom\n5-EXIT");
        int wybor = 0;
        while (wybor!=5){
            wybor = sc.nextInt();
            switch (wybor){
                case 1:
                    zwroc();
                case 2:
                    shyfr();
                case 3:
                    deszyfr();
                case 4:
                    polindrom();
            }
        }

    }
        static String zwroc() {
            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            System.out.println(text);
            return text;
        }
        static void shyfr() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj teks ktory chcesz zaszyfrowac");
            String text = sc.nextLine();
            text.toLowerCase();
            System.out.println("Podaj p");
            int p = sc.nextInt();
            String textZaszyfrowany = "";

            int i = 0;
            int intKod;
            char znak;
            while (i<text.length())
            {
                intKod = (int)text.charAt(i);
                if(intKod>=97 && intKod<=122)
                {
                    int counter = 0;
                    while (counter<p)
                    {
                        if(intKod+1 != 123){
                            intKod++;
                        }
                        else {
                            intKod = 97;
                        }
                        counter++;
                    }
                    znak = (char) intKod;
                }
                else {
                    znak = text.charAt(i);
                }

                textZaszyfrowany += znak;
                i++;
            }

            System.out.println("Zaszyfrowany tekst: "+textZaszyfrowany);
        }
        static void deszyfr() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj teks ktory chcesz deszyfrowac");
            String text = sc.nextLine();
            text.toLowerCase();
            System.out.println("Podaj p");
            int p = sc.nextInt();
            String textDeszyfrowany = "";

            int i = 0;
            int intKod;
            char znak;
            while (i<text.length())
            {
                intKod = (int)text.charAt(i);
                if(intKod>=97 && intKod<=122)
                {
                    int counter = 0;
                    while (counter<p)
                    {
                        if(intKod-1 != 96){
                            intKod--;
                        }
                        else {
                            intKod = 122;
                        }
                        counter++;
                    }
                    znak = (char) intKod;
                }
                else {
                    znak = text.charAt(i);
                }

                textDeszyfrowany += znak;
                i++;
            }
            System.out.println("Deszyfrowany tekst: "+textDeszyfrowany);
        }
        static void polindrom(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj teks ktory chcesz sprawdzic");
            String text = sc.nextLine();
            int c = 0;

            if(text.length()%2 == 0)
            {
                int i = 0;

                while(i < text.length()/2)
                {
                    if(text.charAt(i) == text.charAt(text.length()-i-1))
                    {
                        c++;
                    }
                    else
                    {
                        break;
                    }
                    i++;
                }

            }
            else
            {
                int i = 0;
                while(i < (text.length()-1)/2)
                {
                    if(text.charAt(i) == text.charAt(text.length()-i-1))
                    {
                        c++;
                    }
                    else
                    {
                        break;
                    }
                    i++;
                }

            }
            if(c==text.length()/2)
            {
                System.out.println("Polindrom");
            }
            else
            {
                System.out.println("Nie polindrom");
            }
        }
     static void zadanie5(){
            Scanner sc = new Scanner(System.in);
            int wybor = 3;
            System.out.println("1- liczba calkowita do liczby binarnej\n2 - liczba ziagow zer");
            wybor = sc.nextInt();
            if(wybor == 1)
            {
                int ostatok;

                System.out.println("Podaj liczbe");
                int l = sc.nextInt();
                String temp = "";
                String binarny = "";
                while(l != 0);
                {
                    ostatok = l%2;
                    temp += Integer.toString(ostatok);
                    l = l/2;
                }
                System.out.println("Licba binarna odwrotna= "+temp);
                for(int i = 0; i < temp.length()-1 ; i++)
                {
                    binarny += temp.charAt(temp.length()-1-i);

                }
                System.out.println("Licba binarna = "+binarny);
            }
            if(wybor == 2)
            {

            }
            else
            {
                System.out.println("Niepoprawna liczba");
            }
        }
}