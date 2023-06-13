import java.util.Iterator;
import java.util.LinkedList;

public class HotDrinkIterator implements Iterator<HotDrink> {
    
    private int counter;
    private final LinkedList<HotDrink> hotDrinksList;
    
    public HotDrinkIterator(LinkedList<HotDrink> hotDrinks) {
        this.counter = 0;
        hotDrinksList = hotDrinks;
    }
    
    @Override
    public boolean hasNext() {
        return counter < hotDrinksList.size();    
    }
    @Override
    public HotDrink next() {
        if (!hasNext()) {
            throw new RuntimeException("HotDrink");
        }
        return hotDrinksList.get(counter++);
    }


}
