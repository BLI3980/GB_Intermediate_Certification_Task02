package Model.Ops;

import Model.DB.DatabaseRead;
import Model.DB.DatabaseSave;
import Model.Store.Store;
import Model.Store.Toys.Toy;

import java.util.List;

public class StoreOpsImplement implements StoreOps{

    private Mapper mapper = new Mapper();
    private DatabaseRead readDb;
    private DatabaseSave saveDb;

    public StoreOpsImplement(DatabaseRead readDb) {
        this.readDb = readDb;
    }

    @Override
    public Store<Toy> storeStock() {
        List<String> dbString = readDb.readDatabase();
//        dbString.forEach(System.out::println);
        Store<Toy> dbToys = new Store<>();
        for (String item: dbString) {
//            System.out.println(item);
//            System.out.println(mapper.stringToToy("item " + item));
            dbToys.addToy(mapper.stringToToy(item));
//            System.out.println(mapper.stringToToy(item).getId());
        }
        return dbToys;
    }

    @Override
    public void addToy(Toy newToy) {
        Store<Toy> storeStock = storeStock();
        storeStock.addToy(newToy);
    }

    @Override
    public Store<Toy> findToy(String id) {
        Store<Toy> storeStock = storeStock();
        Store<Toy> result = new Store<>();
        for (Toy item: storeStock) {
            if (item.getId().equals(id)) {
                result.addToy(item);
//                System.out.println(item);
//                return result;
//                storeStock.removeToy(item);
            }
        }
        return result;
    }

    @Override
    public void deleteToy(String id) {
        Store<Toy> storeStock = storeStock();
        for (Toy toy: storeStock) {
            if (toy.getId().equals(id)) {
                storeStock.removeToy(toy);
            }
        }
    }

    @Override
    public void editToy() {

    }
}
