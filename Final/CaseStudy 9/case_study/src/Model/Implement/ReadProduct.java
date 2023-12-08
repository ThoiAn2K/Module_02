package Model.Implement;

public interface ReadProduct {
    String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\DataListProduct.CSV";

    void readShop(String shop);

    void delete(String name);

    boolean isValid(String shop, String product);

    void readAProduct(String product, String shop);

    void ReadAll();
}
