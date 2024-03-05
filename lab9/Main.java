import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int wybor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - zaszyfrowac,\n2 - razszyfrowac");
        wybor  = sc.nextInt();
        String text = null;
        if(wybor == 1){
            try{
                BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/cezar.txt")));
                String linia;

                while ((linia = bufferedReader.readLine()) != null) {
                    text += linia + "\n";
                }

            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                e.printStackTrace();
            }
            int n = text.length();
            System.out.println("Podaj sdwig");
            int j = sc.nextInt();

            String newtext = null;
            for(int i = 0; i<n; i++){
                if(text.charAt(i) != ' ' && text.charAt(i) != '.' && text.charAt(i) != '?' && text.charAt(i) != '!' && text.charAt(i) != ','){
                    char nowyZnak = (char)(text.charAt(i)+j);
                    newtext += nowyZnak;
                }
                else {
                    newtext += text.charAt(i);
                }
            }
            System.out.println(newtext);

            File file = new File("src/szyfr.txt");
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.append(newtext);
                fileWriter.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if(wybor == 2){
            int n;
            String szyfr = null;
            System.out.println("Podaj sdwig");
            int j = sc.nextInt();

            try{
                BufferedReader bufferedReader = new BufferedReader(new FileReader("src/szyfr.txt"));
              szyfr = bufferedReader.readLine();
                n = szyfr.length();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String newtext = null;
            for(int i = 0; i<n; i++){
                if(szyfr.charAt(i) != ' ' && szyfr.charAt(i) != '.' && szyfr.charAt(i) != '?' && szyfr.charAt(i) != '!' && szyfr.charAt(i) != ','){
                    char nowyZnak = (char)(szyfr.charAt(i)-j);
                    newtext += nowyZnak;
                }
                else {
                    newtext += szyfr.charAt(i);
                }
            }
            System.out.println(newtext);
            File file = new File("src/razszyfr.txt");
            try {
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.append(newtext);
                fileWriter.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        else{
            System.out.println("Error");
        }

    }
}