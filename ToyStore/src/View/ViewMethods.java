package View;

import Model.Store.StoreAbstract;
import Model.Toys.Toy;

public class ViewMethods {
    private StoreAbstract<Toy> storeItems;

    public void printStoreItems(StoreAbstract<Toy> items) {
        System.out.printf("\nCurrent %s stock is as follows: \n",items.getStoreName().toUpperCase());
        separator();
        System.out.printf("\n%12s %14s %15s %13s %17s %15s\n",
                "ID", "NAME", "QUANTITY", "W-FACTOR", "CATEGORY", "AGE GROUP");
        items.forEach(System.out::println);
        separator();
        System.out.println();
    }

    public void separator() {
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
    }

}
