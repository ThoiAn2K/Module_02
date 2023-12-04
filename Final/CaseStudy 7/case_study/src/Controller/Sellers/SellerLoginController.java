package Controller.Sellers;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;

public class SellerLoginController extends JFrame {

    public SellerLoginController() {
        JPanel jPanel = new JPanel();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("*** Login of Seller *** ");
        setSize(400, 200);
        jPanel.setLayout(new GridLayout(3, 2));
        setLocationRelativeTo(null);

        JLabel enterAccount = new JLabel("Enter account");
        JTextField account = new JTextField();

        JLabel enterPassword = new JLabel("Enter password");
        JPasswordField password = new JPasswordField();

        JButton confirm = new JButton("Confirm");


        Font font = new Font("Time New Roman",Font.BOLD, 20);

        enterAccount.setFont(font);
        enterPassword.setFont(font);
        account.setFont(font);
        password.setFont(font);

        jPanel.add(enterAccount);
        jPanel.add(account);
        jPanel.add(enterPassword);
        jPanel.add(password);
        jPanel.add(confirm);




        add(jPanel);
        setVisible(true);




    }
}
