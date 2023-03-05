package View;

import Model.Store.StoreAbstract;
import Model.Store.TeenStore;

import java.util.Iterator;

public class ViewMethods implements Iterable<StoreAbstract>{
    private StoreAbstract storeItems;

    public void printStoreItems(StoreAbstract items) {
        System.out.printf("\nCurrent %s stock is as follows: \n",items.getStoreName().toUpperCase());
        separator();
        System.out.printf("\n%12s %14s %15s %13s %17s %15s\n",
                "ID", "NAME", "QUANTITY", "W-FACTOR", "CATEGORY", "AGE GROUP");
        items.forEach(item -> System.out.println(item));
        separator();
        System.out.println();
    }

    public void separator() {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
    }

    @Override
    public Iterator<StoreAbstract> iterator() {
        return storeItems.iterator();
    }
}
