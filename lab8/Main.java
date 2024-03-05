import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//zadanie1.1
interface lancuch{
    String lp(String[] przedmioty);
}

public class Main {
    public static void main(String[] args) {

        //Zadanie 1.1
        String[] ArrayList = new String[3];
        ArrayList[0] = "Matma";
        ArrayList[1] = "Java";
        ArrayList[2]= "Bazy";
        metoda(ArrayList, przedmioty -> {
            System.out.println(przedmioty[0]+" "+przedmioty[1]+" "+przedmioty[2]);
            return null;
        });

        // Zadanie 1.2
        int[] liczby = {10,3,6,4,8,7,2,8,7};
        System.out.println(Arrays.toString(liczby));
        sort(liczby, Integer::compare);
        System.out.println(Arrays.toString(liczby));

        // Zadanie 1.3
        String[] znaki = {"aaa", "aaaaaaa", "a", "aaaa", "aa"};
        System.out.println(Arrays.toString(znaki));
        sort2(znaki, Integer::compare);
        System.out.println(Arrays.toString(znaki));
    }

    //Zadanie 1.1
    public  static void metoda(String[] Arraylist, lancuch lp){
        lp.lp(Arraylist);
    }

    //Zadanie 1.2
    public static  void sort(int[] liczby, Comparator<Integer> comparator){
        int n = liczby.length;
        for(int i = 0; i < n; i++){
            for (int j = 0; j<n-1; j++){
                if(comparator.compare(liczby[j], liczby[j+1])>0){
                    int temp = liczby[j];
                    liczby[j] = liczby[j+1];
                    liczby[j+1] = temp;
                }
            }
        }
    }

    //Zadanie 1.3
    public static  void sort2(String[] znaki, Comparator<Integer> comparator){
        int n = znaki.length;
        for(int i = 0; i < n; i++){
            for (int j = 0; j<n-1; j++){
                if(comparator.compare(znaki[j].length(), znaki[j+1].length())>0){
                    String temp = znaki[j];
                    znaki[j] = znaki[j+1];
                    znaki[j+1] = temp;
                }
            }
        }
    }
}
