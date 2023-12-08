package Controller.Clients.Login;

import Model.Implement.HomePage;
import Model.Utils.Client.ReadDataClient;
import Model.Utils.Client.ReadWalletOfClient;
import Model.Utils.WriterCart;
import Model.Utils.Client.WriterWalletOfClient;
import View.Home.PaymentOfClient;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Payment implements HomePage {
    private static Payment instance;

    public static Payment getInstance() {
        if (instance == null) {
            instance = new Payment();
        }
        return instance;
    }

    @Override
    public void load() {
        payment();
    }


    private void payment() {
        PaymentOfClient paymentOfClient = PaymentOfClient.getInstance();
        paymentOfClient.paymentOfClient();
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        WriterWalletOfClient writerWalletOfClient = WriterWalletOfClient.getInstance();
        writerWalletOfClient.writerWallet(0);
        WriterCart writerCart = new WriterCart();
        ReadDataClient readDataClient = ReadDataClient.getInstance();
        writerWalletOfClient.load();
        String owner = readDataClient.name;
        String shop = null;
        String product = null;
        switch (number) {
            case "1":
                ReadWalletOfClient readWalletOfClient = ReadWalletOfClient.getInstance();
                readWalletOfClient.load();
                load();
                break;
            case "2":
                System.out.println("Enter the amount you need to deposit here");

                boolean isValid = false;
                int countPrice = 0;
                while (!isValid) {

                    try {
                        double newWallet = scanner.nextDouble();
                        writerWalletOfClient.writerWallet(newWallet);
                        System.out.println("Successful deposit");
                        System.out.println();
                        load();
                        isValid = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Please re-enter the amount of money you want to deposit");
                        scanner.nextLine();
                        countPrice++;
                        if (countPrice >= 3) {
                            System.out.println("Too many invalid inputs. Exiting.");
                            isValid = true;
                            load();
                        }
                    }
                }
                break;
                    case "3":
                        Model.Services.GeneralUse.Payment payment = Model.Services.GeneralUse.Payment.getInstance();
                        payment.load();
                        load();
                        System.out.println();
                        break;
                    case "4":
                        HomePageOfClient homePageOfClient = HomePageOfClient.getInstance();
                        homePageOfClient.load();
                        break;
                    default:
                        load();
                        break;
                }
        }
    }
