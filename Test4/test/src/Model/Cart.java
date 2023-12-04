package Model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart(){
        items = new ArrayList<>();
    }

    public Cart(List<Item> items) {
        this.items = items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    public Item getItemById(int id){
        for (Item i:items){
            if(i.getProduct().getId()==id)
                return i;

        }
        return null;
    }
    public int getQuantityById(int id){
        return getItemById(id).getQuantity();
    }
    public void addItem( Item t ){
        if (getItemById(t.getProduct().getId())!=null){
          Item i = getItemById(t.getProduct().getId());
            i.setQuantity(i.getQuantity()+t.getQuantity());
        }else {items.add(t);}
    }


    public void remove(int id){
        if(getItemById(id)!=null){
            items.remove(getItemById(id));
        }
    }
    public double getTotalMoney(){
        double t = 0;
        for(Item i: items )
            t+=(i.getQuantity()*i.getPrice());
        return t;
    }
}
