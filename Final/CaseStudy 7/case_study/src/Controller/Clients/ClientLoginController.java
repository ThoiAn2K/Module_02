package Controller.Clients;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientLoginController extends JFrame{
    public ClientLoginController(){
        JPanel jPanel = new JPanel();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("*** Client *** ");
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

            }
        });

        add(jPanel);
        setVisible(true);


    }
}
