package Model.DB;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DBSaveFile implements DatabaseSave{
    private String dbFile;

    public DBSaveFile(String dbFile) {
        this.dbFile = dbFile;
    }
    @Override
    public void saveDatabase(List<String> database) {
        try (FileWriter writer = new FileWriter(dbFile, false)) {
            for (String line : database) {
                // запись всей строки
                writer.write(line);
                // запись по символам
                writer.append('\n');
            }
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Saving done.");
    }
}
