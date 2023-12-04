import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.GridLayout;


public class RegexExample extends JFrame {
 public RegexExample (){
     JPanel jPanel = new JPanel();
     setTitle("Text");
     setSize(100,100);

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     JTextField account = new JTextField();
     JLabel accountName = new JLabel("Enter Account");

     JPasswordField password = new JPasswordField();
     JLabel passwordName = new JLabel("Enter Password");

     jPanel.setLayout(new GridLayout(3,2));
     jPanel.add(accountName);
     jPanel.add(account);

     jPanel.add(passwordName);
     jPanel.add(password);


     add(jPanel);
//     pack();

     setVisible(true);


 }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RegexExample load = new RegexExample();
            }
        });
    }


}