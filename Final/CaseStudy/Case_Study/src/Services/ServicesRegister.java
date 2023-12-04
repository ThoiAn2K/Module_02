package Services;

import java.util.HashMap;
import java.util.Map;

public class ServicesRegister {
   private static Map<String, String > dataRegister ;

    public ServicesRegister(){
        dataRegister = new HashMap<>();
    }

    public static void setDataRegister(String key, String value ) {
       dataRegister.put("test", "test" );
    }


}
