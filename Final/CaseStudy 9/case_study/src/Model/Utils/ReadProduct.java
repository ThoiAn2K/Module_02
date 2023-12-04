package Model.Utils;

public interface ReadProduct {
    String PATH ="C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\DataListProduct.CSV";
    void read();
    void delete(String name);

    boolean isValid(String product);
    void readAProduct(String product);
void ReadAll();
}
