package Model.Store;

import Model.Store.Toys.Toy;

import java.util.List;

public class Store<Toy> extends StoreAbstract<Toy>{


    public Store(String storeName) {
        super(storeName);
    }

    public Store() {
        super();
    }



    @Override
    public String toString() {
        return "Store stock: " +super.toString();
    }
}
