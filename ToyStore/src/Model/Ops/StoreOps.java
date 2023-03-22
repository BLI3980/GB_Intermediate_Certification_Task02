package Model.Ops;

import Model.Store.Store;
import Model.Store.Toys.Toy;

public interface StoreOps {
    Store<Toy> storeStock();

    void addToy(Toy newToy);

    Store<Toy> findToy(String id);
    void deleteToy(String id);
    void editToy();
}
