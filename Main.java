
public class Main {
    public static void main(String[] args) {
        WeightedRandomBag<String> itemDrops = new WeightedRandomBag<>();

    // Setup - a real game would read this information from a configuration file or database
        itemDrops.addEntry("10 Gold",  0.05);
        itemDrops.addEntry("Sword",   0.2);
        itemDrops.addEntry("Shield",  0.45);
        itemDrops.addEntry("Armor",   0.2);
        itemDrops.addEntry("Potion",  0.1);

    // drawing random entries from it
        for (int i = 0; i < 100; i++) {
            System.out.println(itemDrops.getRandom());
        }

    }
}
