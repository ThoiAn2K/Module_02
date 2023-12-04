package Services;

import Utils.WriterDataAccountClients;

import java.awt.List;

public class Write {
public static void write( String account, String password){
    String [] newdata = {account,password};
    WriterDataAccountClients.writerDataClients(newdata);
}
}
