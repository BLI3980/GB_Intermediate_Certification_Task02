package View;

import Model.Store.Store;
import Model.Store.StoreAbstract;
import Model.Store.Toys.Toy;

import java.util.Scanner;

public class Views {
    private Store<Toy> storeItems;



//    public void run(){
//        System.out.println("WELCOME TO THE TOY STORE! \n");
//        while (true) {
//            String command = mainMenu();
////            String command = prompt("\nChoose the action from the list below:\n" +
////                    "1. See current stock\n" +
////                    "2. Add new toy to the stock.\n" +
////                    "3. Find a toy.\n" +
////                    "4. Edit toy info (name, qty, w_factor, category, age group).\n" +
////                    "5. Delete a toy from stock.\n" +
////                    "6. Exit the notebook.\n" +
////                    "Type your choice here: ");
//            if (command.equals("7")) return;
//
//            try {
//                switch (command) {
//                    case "1":
//                        String header = prompt("Write short description of new note: ");
//                        String noteText = prompt("Write a text of the note itself: ");
//                        controller.saveNote(new RecordBasic(header,noteText));
//                        break;
//                    case "2":
//                        System.out.println("\n==========================");
//                        List<Record> notes = controller.readAllNotes();
//                        for (Record note: notes) {
//                            System.out.println(note);
//                        }
//                        System.out.println("\n==========================");
//                        break;
//                    case "3":
//                        String id = prompt("Enter id of note: ");
//                        Record record = controller.readNote(id);
//                        System.out.println("\n==========================" +
//                                "\n" + record +"\n" +
//                                "==========================");
//                        break;
//                    case "4":
//                        String idToChange = prompt("Enter ID of a note to edit: ");
//                        controller.checkIfIdExists(idToChange);
//                        controller.editNote(idToChange,noteDetails());
//                        break;
//                    case "5":
//                        String idToDelete = prompt("Enter ID of a note to delete: ");
//                        controller.checkIfIdExists(idToDelete);
//                        controller.deleteNote(idToDelete);
//                        System.out.println("\n==========================\n" +
//                                "Note is deleted. See entire notebook to confirm.\n" +
//                                "==========================\n" );
//                        break;
//                }
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());;
//            }
//        }
//    }

    public String mainMenu() {
        String command = prompt("\nChoose the action from the list below:\n" +
                "1. See current stock\n" +
                "2. Add new toy to the stock.\n" +
                "3. Find a toy by ID.\n" +
                "4. Edit toy info (name, qty, w_factor).\n" +
                "5. Delete a toy from stock.\n" +
                "6. Make a raffle.\n" +
                "7. Exit.\n" +
                "Type your choice here: ");
        return command;
    }

    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }







    public String stockEmptyPhrase() {
        return String.format("These toys are finished. Try to draw again");
    }

    public void printStoreItems(Store<Toy> items) {
//        System.out.printf("\nCurrent %s stock is as follows: \n",items.getStoreName().toUpperCase());
        separator();
        System.out.printf("\n%12s %14s %15s %13s %15s\n",
                "ID", "NAME", "QUANTITY", "W-FACTOR", "CATEGORY");
        items.forEach(System.out::println);
        separator();
        System.out.println();
    }

    public void separator() {
        for (int i = 0; i < 75; i++) {
            System.out.print("-");
        }
    }

}
