import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numberSet = new HashSet<>();
        numberSet.add(10);
        numberSet.add(5);
        numberSet.add(8);

        int maxValue = CollectionUtilsAdapter.findMaxValue(numberSet);
        System.out.println("Max value: " + maxValue);
    }
    }


