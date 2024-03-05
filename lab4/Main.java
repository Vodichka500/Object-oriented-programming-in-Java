// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
public class Main {
    public static void main(String[] args) {
    //zadanie 1
        System.out.println("Zadanie 1\nTablica jednowymiarowa: ");
        int[] tabJ1 = new int[100];
        tabJ1 = jeden();
        for(int i =0; i<100; i++)
        {
            System.out.print(tabJ1[i]+" ");
        }
        System.out.println("\n\n");
        int tabJ2[][] = dwa();
        int counter =0;
        int srednia[] = new int[10];
        for (int j = 0; j<10; j ++)
        {
            for(int i = 0; i<10; i++)
            {
               srednia[j] += tabJ2[i][j];
            }
            srednia[j] = srednia[j]/10;
        }

        for(int i = 0; i < 10; i ++)
        {
            for(int j = 0; j<10; j++)
            {
                if(counter >=0 && counter<=9)
                {
                    System.out.print("0"+tabJ2[i][j]+" ");
                }
                else
                {
                    System.out.print(tabJ2[i][j]+" ");
                }
                counter++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i = 0; i<10; i++)
        {
            System.out.print(srednia[i]+" ");
        }
        System.out.print("\n\n");

        //ZADANIE2

        int tab[][] = random();
        for(int i = 0; i < 10; i ++)
        {
            for(int j = 0; j<10; j++)
            {
                if(tab[i][j]<0 && tab[i][j]>-10)
                {
                    System.out.print(" "+tab[i][j]+"  " );
                }
                if(tab[i][j]<=-10)
                {
                    System.out.print(tab[i][j]+"  " );
                }
                if(tab[i][j]>=0 && tab[i][j]<10)
                {
                    System.out.print("  "+tab[i][j]+"  " );
                }
                if(tab[i][j]>=10)
                {
                    System.out.print(" "+tab[i][j]+"  " );
                }

            }
            System.out.print("\n");
        }


        //ZADANIE 3
        utworz();


    }
    //ZADANIE 4.1
    static int[] jeden(){
        int[] tabJ = new int[100];
        for(int i = 0; i<tabJ.length; i++)
        {
            tabJ[i]=i;
        }
        return tabJ;
    }
    static int[][] dwa() {
        int tabD[][] = new int[10][10];
        int counter = 0;
        for(int i=0; i<10; i++)
        {
            for(int j = 0; j<10;j++)
            {
                tabD[i][j]= counter;
                counter ++;
            }
        }

        return tabD;
    }
    //ZADANIE 4.2
    static int[][] random() {
        Random rand = new Random();
        int n = rand.nextInt(11)+10;

        int tab[][] = new int[n][n];
        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(i == j)
                {
                    tab[i][j] = rand.nextInt(3)-1;

                }
                else
                {
                    tab[i][j] = rand.nextInt(41) - 20;
                }
            }
        }

        oblic(tab, n);
        return tab;
    }
        static void oblic(int tab[][], int n) {
            int suma1 = 0;
            int suma2=0;
            for (int i = 0; i<n; i++)
            {
                for(int j = 0; j < n; j ++)
                {
                    suma1 +=tab[i][j];
                }
                i++;
            }
            for (int j = 1; j<n; j++)
            {
                for(int i = 0; i < n; i ++)
                {
                    suma2 +=tab[i][j];
                }
                j++;
            }

            float result = suma1/suma2;
            System.out.println("Stosunek sumy do sumy: "+result);

        }

    //ZADANIE 4.3
    static void utworz()
    {
        Okrag[] o = new Okrag[3];
        o[0] = new Okrag();
        o[1] = new Okrag();
        o[2] = new Okrag();

        sprawdz(o[0],o[1]);
        wyswetl(o);
    }
        static void sprawdz(Okrag o1, Okrag o2) {
            double distance = Math.sqrt(Math.pow(o1.x - o2.x, 2) + Math.pow(o1.y- o2.y, 2));
            int sumR = o1.r + o2.r;

            if(distance == sumR){
                System.out.println("Styczne");
            }else if(distance < sumR){
                System.out.println("Przecinają sie");
            }else if(distance > sumR){
                if(distance > Math.max(o1.r , o2.r)){
                    System.out.println("Rozlaczne");
                } else if (distance < Math.max(o1.r , o2.r)) {
                    System.out.println("Pokrywajace");
                }
            }else{
                System.out.println("Nieznane Polozenie");
            }

        }
        static void wyswetl(Okrag[] o){
            for(Okrag O : o){
                System.out.println("X = "+O.x+" Y = "+O.y+" R = "+O.r);
            }
        }
}
