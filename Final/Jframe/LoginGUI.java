import com.opencsv.CSVWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.plaf.PanelUI;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class LoginGUI extends JFrame {
    public LoginGUI(){
        setTitle("Login");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.add(new Button("Login"));
        jPanel.add(new Button("Register"));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Tên đăng nhập:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Mật khẩu:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Đăng nhập");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = passwordField.getText();
               String [] data = {username,password};
               saveData(data);
            }
        });

        add(jPanel);

        panel.add(usernameLabel);
        panel.add(usernameField);

        panel.add(passwordLabel);
        panel.add(passwordField);


        panel.add(loginButton);

        add(panel);
        pack();

        setLocationRelativeTo(null);
        setVisible(true);
    };

    public static void saveData(String [] data){
        String PATH ="C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\Jframe\\Test.csv";
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH,true));
            csvWriter.writeNext(data);
            csvWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginGUI load = new LoginGUI();
            }
        });
    }
}
