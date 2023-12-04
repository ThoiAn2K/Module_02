package Controller.Sellers;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HomePageOfSeller extends JFrame {

    private static HomePageOfSeller instance;
    public static HomePageOfSeller getInstance() {
        if (instance == null) {
            synchronized (HomePageOfSeller.class) {
                if (instance == null) {
                    instance = new HomePageOfSeller();
                }
            }
        }
        return instance;
    }

    public HomePageOfSeller(){
        JPanel jPanel = new JPanel();
        setTitle("Home page of seller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel test = new JLabel("Welcome");
        jPanel.add(test);
        add(jPanel);

        setVisible(true);
    }

}
