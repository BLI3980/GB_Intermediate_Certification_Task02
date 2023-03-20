import Controller.Controller;
import Model.Raffle.Raffle;
import Model.Store.Store;
import Model.Toys.*;
import View.Views;

public class Main {
    public static void main(String[] args) {
        Store<Toy> toyStore = new Store<>("Toy Store");


        PreSchool<Category,Ageable> toy1 = new PreSchool<>( "Teddy Bear",
                15, 0.15, new StuffedToy(),new OneYearPlus());
        toyStore.addToy(toy1);
        toyStore.addToy(new PreSchool<Category, Ageable>("Cheburashka", 20,
                0.25, new StuffedToy(), new OneYearPlus()))
                .addToy(new PreSchool<Category,Ageable>("Spider Man", 30,
                        0.45, new PlaySet(), new ThreeYearPlus()));
//        toy1.setAgeGroup(new ThreeYearPlus());
        toy1.setW_factor(0.17);


        Teenager<Category,Ageable> toy2 = new Teenager<>( "Marvel Puzzle",
                5, 0.1, new Puzzle(), new TenYearPlus());
        toyStore.addToy(toy2);
        toyStore.addToy(new Teenager<>( "Tank", 15,
                0.05, new Constructor(), new TenYearPlus()));

//        for (Toy item: toyStore) {
//            if (item.getName().equals("Spider Man")) {
//                item.setQty(31);
//            }
//        }

        Views print1 = new Views();
        print1.printStoreItems(toyStore);

        Raffle<Toy> newRaffle = new Raffle<>(toyStore);
//        System.out.println(newRaffle.draw());
//        for (Raffle.RaffleToy item: newRaffle.fillList()) {
//            System.out.println(item);
//        }
//        for (int i = 0; i < 100; i++) {
//            System.out.println(newRaffle.draw());
//        }

        Controller controller = new Controller();
        controller.run();

    }
}
