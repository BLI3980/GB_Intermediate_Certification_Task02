import Config.Config;
import Controller.Controller;
import Model.DB.DBReadFile;
import Model.DB.DatabaseRead;
import Model.Ops.StoreOpsImplement;
import Model.Store.Raffle.Raffle;
import Model.Store.Store;
import Model.Store.Toys.*;

public class Main {
    public static void main(String[] args) {
//        Store<Toy> toyStore = new Store<>("Toy Store");
//
//
//        Toy toy1 = new StuffedToy( "Teddy Bear", 15, 0.15);
//        toyStore.addToy(toy1);
//        toyStore.addToy(new StuffedToy("Cheburashka", 20, 0.25))
//                .addToy(new PlaySet("Spider Man", 30, 0.45));
//        toy1.setW_factor(0.17);
//
//
//        Toy toy2 = new Puzzle( "Marvel Puzzle", 5, 0.1);
//        toyStore.addToy(toy2);
//        toyStore.addToy(new Constructor( "Tank", 15, 0.05));

//        Toy toy3 = new PlaySet("Hot wheels", 8, 0.20);
//        System.out.println(toy3.getCategory());

//        for (Toy item: toyStore) {
//            if (item.getName().equals("Spider Man")) {
//                item.setQty(31);
//            }
//        }

//        Views print1 = new Views();
//        print1.printStoreItems(toyStore);
//
//        Raffle<Toy> newRaffle = new Raffle<>(toyStore);
//        System.out.println(newRaffle.draw());
//        for (Raffle.RaffleToy item: newRaffle.fillList()) {
//            System.out.println(item);
//        }
//        for (int i = 0; i < 100; i++) {
//            System.out.println(newRaffle.draw());
//        }
        DatabaseRead dbRead = new DBReadFile(Config.dbFile); // List<String>
//        System.out.println("DB is read");
        StoreOpsImplement storeOps = new StoreOpsImplement(dbRead);
        Store<Toy> storeStock = storeOps.storeStock();
        Raffle<Toy> toyRaffle = new Raffle<>(storeStock);
//        Store<Toy> toyStore = new Store<>(dbRead);
//        List<String> testList = new ArrayList<>();
//        testList.add("This is a test text for dbSave method. ");

//        Mapper mapper = new Mapper();
//        String toy1String = mapper.toyToString(toy1);
//        testList.add(toy1String);

//        for (Toy item: toyStore) {
//            testList.add(mapper.toyToString(item));
////            System.out.println(item.getCategory());
//        }

//        for (String item: testList) {
//            System.out.println(item);
//        }

//        DatabaseSave dbSave = new DBSaveFile(Config.dbFile);
//        dbSave.saveDatabase(testList);

        Controller controller = new Controller(storeOps, toyRaffle);
        controller.run();


    }
}
