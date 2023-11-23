package Model;

import java.util.List;

public class ProductCategory extends Category {
    private List<PetCategory> petCategories;

    public ProductCategory(){
        super();
    }
    public ProductCategory(int id){
        super(id);
    }
    public ProductCategory(int id, String name){
        super(id, name);
    }

}
