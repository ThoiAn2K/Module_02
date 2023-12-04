package Controller;

import Controller.Clients.ClientsController;
import Controller.Sellers.SellerController;

import javax.swing.JButton;ja
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    private static HomePage instance;

    public static HomePage getInstance() {
        if (instance == null) {
            synchronized (HomePage.class) {
                if (instance == null) {
                    instance = new HomePage();
                }
            }
        }
        return instance;
    }

    public HomePage() {
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.CYAN);
        setTitle("Home Page");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel.setLayout(new GridLayout(4, 1));
        setLocationRelativeTo(null);
        setResizable(false); // khong thay doi khung


        JLabel jLabel = new JLabel("Welcome to My System");
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        JButton seller = new JButton("seller");
        JButton client = new JButton("client");

        // JLabel contentLabel = new JLabel("Nội dung không thể chỉnh sửa");
        //ontentLabel.setHorizontalAlignment(JLabel.CENTER); // Căn giữa nội dung

        Font buttonFont = new Font("Time New Romans", Font.BOLD, 20);
//        Dimension sellerButtonSize = new Dimension(100, 50);
//        Dimension clientButtonSize = new Dimension(100, 50);

//
//        seller.setPreferredSize(sellerButtonSize);
//        client.setPreferredSize(clientButtonSize);

        jLabel.setFont(buttonFont);
        seller.setFont(buttonFont);
        client.setFont(buttonFont);


        //     jPanel.add(contentLabel);

        jPanel.add(jLabel);
        jPanel.add(seller);
        jPanel.add(client);
        add(jPanel);


        seller.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

                SellerController sellerFrame = new SellerController();
            }
        });
        client.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

                ClientsController clientsController = new ClientsController();
            }
        });
//        pack();
        setVisible(true);
    }

}
