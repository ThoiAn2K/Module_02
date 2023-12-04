package Controller.Sellers;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SellerController extends JFrame {
    public SellerController() {
        JPanel jPanel = new JPanel();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("*** Seller *** ");
        setSize(400, 200);
        jPanel.setLayout(new GridLayout(2, 0));
        setLocationRelativeTo(null);

//        JLabel login = new JLabel("Login");
        JButton login = new JButton("Login");


//        JLabel register = new JLabel("Register");
        JButton register = new JButton("Register");

        Font resultsTest = new Font("Time New Romans", Font.BOLD, 20);
        login.setFont(resultsTest);
        register.setFont(resultsTest);

        jPanel.add(login);
        jPanel.add(register);


        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                SellerLoginController sellerLoginController = new SellerLoginController();

            }
        });

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                SellerRegisterController sellerRegisterController = new SellerRegisterController();
            }
        });

        add(jPanel);
        setVisible(true);


    }
}
