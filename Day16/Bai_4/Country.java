public class Country {
    private int id;
    private String name;
    private String code;

    public Country(){};

    public Country(int id, String name, String code){
        this.id = id;
        this.name = name;
        this.code = code;

    }

   public int getId(){
        return id;
   }

   public void setId(int id){
        this.id = id ;
   }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
}
}
