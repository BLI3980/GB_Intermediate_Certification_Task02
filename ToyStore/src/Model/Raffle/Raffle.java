package Model.Raffle;

import Model.Store.Store;

import java.util.List;

public class Raffle {
    private Store store;
    private List listOfIds;

    public Raffle(Store store, List listOfIds) {
        this.store = store;
        this.listOfIds = listOfIds;
    }

    private List getList (Store store) {
        for (Store substore: store) {
            for (Store item: substore) {

            }
        }
    }
}
