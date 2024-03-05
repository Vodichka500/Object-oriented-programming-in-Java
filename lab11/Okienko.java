import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Okienko extends JFrame{
    private JPanel panelMain;
    private JTextField textUser;
    private JButton copyButton;
    private JLabel LabelCopy;

    public Okienko() {
        copyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LabelCopy.setText(textUser.getText());
                textUser.setText("");
            }
        });
        copyButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                copyButton.setBackground(new Color((float)Math.random(),(float)Math.random(),(float)Math.random()));
            }
        });
    }
    public static void main(String[] args){
        Okienko okno = new Okienko();okno.setContentPane(okno.panelMain);
        okno.setTitle("Okno");
        okno.setSize(300,400);
        okno.setVisible(true);
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
