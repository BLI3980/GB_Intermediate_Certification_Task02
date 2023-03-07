import Model.Toys.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeightedRandomBag<T extends Object> {

    private class Entry {
        double accumulatedWeight;
        T toy;
    }

    private List<Entry> entries = new ArrayList<>();
    private double accumulatedWeight;
    private Random rand = new Random();

    public void addEntry(T toy, double weight) {
        accumulatedWeight += weight;
        Entry e = new Entry();
        e.toy = toy;
        e.accumulatedWeight = accumulatedWeight;
        entries.add(e);
    }

    public T getRandom() {
        double r = rand.nextDouble() * accumulatedWeight;

        for (Entry entry: entries) {
            if (entry.accumulatedWeight >= r) {
                return entry.toy;
            }
        }
        return null; //should only happen when there are no entries
    }
}