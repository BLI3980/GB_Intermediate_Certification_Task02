package Controller;

import View.Views;

import java.util.List;

public class Controller {
    private Views view;

    public void run(){
        System.out.println("WELCOME TO THE TOY STORE! \n");
        while (true) {
            String command = view.mainMenu();
//            String command = prompt("\nChoose the action from the list below:\n" +
//                    "1. See current stock\n" +
//                    "2. Add new toy to the stock.\n" +
//                    "3. Find a toy.\n" +
//                    "4. Edit toy info (name, qty, w_factor, category, age group).\n" +
//                    "5. Delete a toy from stock.\n" +
//                    "6. Exit the notebook.\n" +
//                    "Type your choice here: ");
            if (command.equals("7")) return;

            try {
                switch (command) {
                    case "1":
                        view.printStoreItems();
                        break;
                    case "2":
//                        System.out.println("\n==========================");
//                        List<Record> notes = controller.readAllNotes();
//                        for (Record note: notes) {
//                            System.out.println(note);
//                        }
//                        System.out.println("\n==========================");
                        break;
                    case "3":
//                        String id = prompt("Enter id of note: ");
//                        Record record = controller.readNote(id);
//                        System.out.println("\n==========================" +
//                                "\n" + record +"\n" +
//                                "==========================");
                        break;
                    case "4":
//                        String idToChange = prompt("Enter ID of a note to edit: ");
//                        controller.checkIfIdExists(idToChange);
//                        controller.editNote(idToChange,noteDetails());
                        break;
                    case "5":
//                        String idToDelete = prompt("Enter ID of a note to delete: ");
//                        controller.checkIfIdExists(idToDelete);
//                        controller.deleteNote(idToDelete);
//                        System.out.println("\n==========================\n" +
//                                "Note is deleted. See entire notebook to confirm.\n" +
//                                "==========================\n" );
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());;
            }
        }
    }
}
