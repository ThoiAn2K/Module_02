import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"))) {
            output.writeUTF("John");
            output.writeDouble(856.5);
            output.writeUTF("Susan");
            output.writeDouble(1856.5);
            output.writeUTF("Kim");
            output.writeDouble(105.25);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"))) {
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readUTF() + " " + input.readDouble());


        } catch (EOFException e) {
                    System.out.println("All data were read");
        } catch (IOException e) {
           e.printStackTrace();
        }
    }

}
