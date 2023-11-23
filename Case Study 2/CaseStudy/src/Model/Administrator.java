package Model;

public class Administrator extends User {
    public Administrator(){
        super();
    }
    public Administrator(int id){
        super(id);
    }
    public Administrator (int id, String login, String password, String email ){
        super(id,login,password,email);
    }
    public int hashCode(){
        return getId();
    }
    @Override
    public boolean equals(Object object){
        if(!(object instanceof Administrator)){
            return false;
        }
        Administrator other = (Administrator) object;
        return ((this.getId()!=0)&& (this.getId() == other.getId()))?true:false;
    }
    public String toString(){
        return "Administrator: "+super.toString();
    }

}
