import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeightedRandomBag<T extends Object> {
    private List<Entry> entries = new ArrayList<>(); // list of entries
    private double accumulatedWeight; // A cumulative number of all weights in a list of toys
    private Random rand = new Random();

    private class Entry {  //An instance of a toy entry
        double accumulatedWeight;
        T toy;
    }

    public void addEntry(T toy, double weight) {
        accumulatedWeight += weight;  // Increase cumulative weight
        Entry e = new Entry();  //Create new toy
        e.toy = toy;  //Assign argument to the toy
        e.accumulatedWeight = accumulatedWeight;  // Add updated value to new toy
        entries.add(e);  // Add new toy to the list of toys
    }

    public T getRandom() {
        double r = rand.nextDouble() * accumulatedWeight;
            // random value b/w 0..0.99 times cumulative weight b/w 0..1

        for (Entry entry: entries) {
            if (entry.accumulatedWeight >= r) {  // Random selection of a toy
                return entry.toy;
            }
        }
        return null; //should only happen when there are no entries
    }
}