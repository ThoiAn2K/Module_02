package Controller.Clients;

import Model.Utils.Writer.WriterClient;
import Model.Utils.Writer.WriterSeller;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientRegisterController extends JFrame {
    public ClientRegisterController() {
        JPanel jPanel = new JPanel();
        setTitle("Register of Client");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        jPanel.setLayout(new GridLayout(10, 0));

        JLabel description = new JLabel("Register of seller");
        description.setHorizontalAlignment(JLabel.CENTER);
        Font fonts = new Font("Time New Roman", Font.BOLD, 20);

        JLabel enterAccount = new JLabel("Enter account");
        JTextField account = new JTextField();

        JLabel enterPassword = new JLabel("Enter password");
        JPasswordField passwordField = new JPasswordField();

        JLabel enterPasswordNumber2 = new JLabel("Enter again password");
        JPasswordField passwordField2 = new JPasswordField();

        JLabel shopName = new JLabel("Enter your name");
        JTextField shopNameField = new JTextField();

        JButton confirm = new JButton("Confirm");

        description.setFont(fonts);
        enterAccount.setFont(fonts);
        enterPassword.setFont(fonts);
        enterPasswordNumber2.setFont(fonts);
        account.setFont(fonts);
        passwordField.setFont(fonts);
        passwordField2.setFont(fonts);
        shopName.setFont(fonts);
        shopNameField.setFont(fonts);


        jPanel.add(description);
        jPanel.add(enterAccount);
        jPanel.add(account);
        jPanel.add(enterPassword);
        jPanel.add(passwordField);
        jPanel.add(enterPasswordNumber2);
        jPanel.add(passwordField2);
        jPanel.add(shopName);
        jPanel.add(shopNameField);
        jPanel.add(confirm);

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String accounts = account.getText();
                String passwords = passwordField2.getText();
                String shopName = shopNameField.getText();
                String[] data = {accounts, passwords,shopName};
                WriterClient writerClients = new WriterClient();
                writerClients.writerDataClients(data);
            }
        });


        add(jPanel);
        setVisible(true);
    }
}
