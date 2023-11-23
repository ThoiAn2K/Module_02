

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter {
    public static int findMaxValue(Set<Integer> set){
        List<Integer> list = new ArrayList<>(set);
        return Collections.max(list);
    }
}
