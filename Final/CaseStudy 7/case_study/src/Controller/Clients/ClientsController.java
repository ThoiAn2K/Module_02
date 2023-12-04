package Controller.Clients;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;

public class ClientsController extends JFrame {
    public ClientsController() {
        JPanel jPanel = new JPanel();
        setLocationRelativeTo(null);
        setTitle("*** Client *** ");
        setSize(400, 200);
        jPanel.setLayout(new GridLayout(2, 0));

        JButton login = new JButton("Login");

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
                ClientLoginController clientLoginController = new ClientLoginController();
            }
        });
        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ClientRegisterController clientRegisterController = new ClientRegisterController();
            }
        });
        add(jPanel);
        setVisible(true);

    }
}
