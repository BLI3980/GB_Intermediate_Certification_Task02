import Model.Store.Store;
import Model.Toys.*;
import View.ViewMethods;

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



        Teenager<Category,Ageable> toy2 = new Teenager<>( "Marvel Puzzle",
                5, 0.1, new Puzzle(), new TenYearPlus());
        toyStore.addToy(toy2);
        toyStore.addToy(new Teenager<>( "Tank", 15,
                0.05, new Constructor(), new TenYearPlus()));



        ViewMethods print1 = new ViewMethods();
        print1.printStoreItems(toyStore);


    }
}
