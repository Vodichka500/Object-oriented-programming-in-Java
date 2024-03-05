import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends  JFrame{
    private float rezult;
    private String liczba = "";
    private String currentMethod = "empty";

    private JLabel ekran;
    private JButton backButton;
    private JButton DelButton;
    private JButton stopien;
    private JButton equals;
    private JButton minus;
    private JButton multiply;
    private JButton divide;
    private JButton plus;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton one;
    private JButton two;
    private JButton thre;
    private JButton ZeroButton;
    private JButton dot;
    private JButton pierwiastek;
    private JButton decimal;
    private JPanel kalkulator;
//*********************************************************************
    void licz(){
        if(currentMethod == "empty"){

        } else if (currentMethod == "plus") {
            rezult += Float.parseFloat(liczba);
        }else if (currentMethod == "minus") {
            rezult -= Float.parseFloat(liczba);
        }else if (currentMethod == "deli") {
            rezult /= Float.parseFloat(liczba);
        }else if (currentMethod == "mnoz") {
            rezult *= Float.parseFloat(liczba);
        }else if (currentMethod == "stopien") {
            rezult*=rezult;
        }else if (currentMethod == "pierwiastek") {
            if(rezult>=0){
                rezult = (float)Math.sqrt(rezult);
            }
        }


    }


    boolean first(){
        return (ekran.getText() == "Kalkulator");
    }

//********************************************************************
// DELETE BUTTON
    public Kalkulator(){
        DelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rezult = 0;
                liczba = "";
                currentMethod = "empty";
                ekran.setText("Kalkulator");
            }
        });

// BACKSPACE BUTTON
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!first() && liczba != ""){
                    String temp = liczba.substring(0, liczba.length()-1);
                    liczba = temp;
                    ekran.setText(liczba);
                }else if(liczba.length()-1 == 0){
                    liczba = "";
                    ekran.setText(liczba);
                }


            }
        });

// STOPIEN BUTTON
        stopien.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentMethod == "empty"){
                    rezult += Float.parseFloat(liczba);

                }

                    currentMethod = "stopien";
                    licz();
                    liczba = "";
                    ekran.setText("="+String.valueOf(rezult));
                    currentMethod = "continue";


            }
        });

// PIERWIASTEK BUTTON
        pierwiastek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentMethod == "empty"){
                    rezult += Float.parseFloat(liczba);

                }

                currentMethod = "pierwiastek";
                licz();
                liczba = "";
                ekran.setText("="+String.valueOf(rezult));
                currentMethod = "continue";
            }
        });

// PODZIELIĆ BUTTON
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentMethod == "empty"){
                    rezult += Float.parseFloat(liczba);
                    ekran.setText("/");
                    liczba = "";
                    currentMethod = "deli";
                }
                else{
                    if(liczba != "") {
                        licz();
                    }
                    ekran.setText(String.valueOf(rezult));
                    liczba = "";
                    ekran.setText("/");
                    currentMethod = "deli";

                }
            }
        });

// MNOŻENIE BUTTON
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentMethod == "empty"){
                    rezult += Float.parseFloat(liczba);
                    ekran.setText("*");
                    liczba = "";
                    currentMethod = "mnoz";
                }
                else{
                    if(liczba != "") {
                        licz();
                    }
                    ekran.setText(String.valueOf(rezult));
                    liczba = "";
                    ekran.setText("*");
                    currentMethod = "mnoz";

                }
            }
        });

// MINUS BUTTON
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentMethod == "empty"){
                    rezult += Float.parseFloat(liczba);
                    ekran.setText("-");
                    liczba = "";
                    currentMethod = "minus";
                }
                else{
                    if(liczba != "") {
                        licz();
                    }
                    ekran.setText(String.valueOf(rezult));
                    liczba = "";
                    ekran.setText("-");
                    currentMethod = "minus";

                }
            }
        });

// PLUS BUTTON
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentMethod == "empty"){
                    rezult += Float.parseFloat(liczba);
                    ekran.setText("+");
                    liczba = "";
                    currentMethod = "plus";
                }
                else{
                    if(liczba != "") {
                        licz();
                    }
                    ekran.setText(String.valueOf(rezult));
                    liczba = "";
                    ekran.setText("+");
                    currentMethod = "plus";

                }

            }
        });

// RÓWNO BUTTON
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(liczba != ""){
                    licz();
                    liczba = "";
                    ekran.setText("="+String.valueOf(rezult));
                }
            }
        });

//********************************************************************
        ZeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!first() && liczba != ""){
                    liczba += "0";
                    ekran.setText(liczba);
                }else if(currentMethod == "mnoz"){
                    liczba += "0";
                    ekran.setText(liczba);
                }

            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba += "1";
                ekran.setText(liczba);
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba += "2";
                ekran.setText(liczba);
            }
        });
        thre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba += "3";
                ekran.setText(liczba);
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba += "4";
                ekran.setText(liczba);
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba += "5";
                ekran.setText(liczba);
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba += "6";
                ekran.setText(liczba);
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba += "7";
                ekran.setText(liczba);
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba += "8";
                ekran.setText(liczba);
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                liczba += "9";
                ekran.setText(liczba);
            }
        });

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(first() || liczba == ""){
                    liczba += "0.";
                    ekran.setText(liczba);
                }
                else{
                    if(!liczba.contains(".")){
                        liczba += ".";
                        ekran.setText(liczba);
                    }

                }
            }
        });
        decimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(first()){
                    ekran.setText("ERROR");
                } else if (rezult == 0 && liczba != "") {
                    StringBuilder binary = new StringBuilder();
                    int rezulti = Integer.valueOf(liczba);
                    while (rezult > 0){
                        int remi = rezulti%2;
                        binary.insert(0, remi);
                        rezulti/=2;
                    }
                    ekran.setText(binary.toString());
                } else if(rezult != 0 && liczba == ""){
                    StringBuilder binary = new StringBuilder();
                    int rezulti = (int) rezult;
                    while (rezult > 0){
                        int remi = rezulti%2;
                        binary.insert(0, remi);
                        rezulti/=2;
                    }
                    ekran.setText(binary.toString());
                }
            }
        });
    }
    public static void main(String[] args){
        Kalkulator k = new Kalkulator();
        k.setContentPane(k.kalkulator);
        k.setTitle("kalkulator");
        k.setSize(300,400);
        k.setVisible(true);
        k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
