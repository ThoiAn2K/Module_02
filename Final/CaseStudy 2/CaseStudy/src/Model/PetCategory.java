package Model;

import java.util.List;

public class PetCategory extends Category {
    private List<PetCategory> productCategories;
    public PetCategory(){
    super();
    }
    public PetCategory(int id){
        super(id);

    }
    public PetCategory(int id, String name){
        super(id, name);
    }
    public List<PetCategory> getProductCategories() {
        return productCategories;
    }

    public void setProductCategories(List<PetCategory> productCategories) {
        this.productCategories = productCategories;
    }
    public String toString(){
        return "Pet "+super.toString();
    }
    public int hashCode(){
        return getId();
    }
    @Override
    public boolean equals(Object object){
        if (!(object instanceof PetCategory)){
            return false;
        }
        PetCategory other = (PetCategory) object;
        return ((this.getId()!=0)&&(this.getId()==other.getId()))?true:false;
    }
}