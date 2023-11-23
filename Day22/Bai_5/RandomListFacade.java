import java.util.List;

public class RandomListFacade {

    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade(){
        randomList = new RandomList();
        listFilter = new ListFilter();
        listPrinter = new ListPrinter();
    }
    public void printRandomEvenList(){
        List<Integer> numbers = randomList.generateList(100,1,100);
        List<Integer> evenNumbers = listFilter.filterOdd(numbers);
        listPrinter.printList(evenNumbers);

    };

}
