package Model.Raffle;

import Model.Store.Store;
import Model.Toys.Toy;

import java.util.Iterator;
import java.util.List;

public class Raffle implements Iterable<Toy>{
    private Store<Toy> store;
    private Store<Toy> raffle = new Store<>();
    private List<String> listOfIds;


    public Raffle(Store<Toy> store, Store<Toy> raffle, List<String> listOfIds) {
        this.store = store;
        this.raffle = raffle;
        this.listOfIds = listOfIds;
    }

    public Store<Toy> raffleList (Store<Toy> store) {

    }

    @Override
    public Iterator<Toy> iterator() {
        return store.iterator();
    }
}
