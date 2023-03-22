package Model.DB;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DBReadFile implements DatabaseRead {
    private String dbFile;

    public DBReadFile(String dbFile) {
        this.dbFile = dbFile;
    }

    @Override
    public List<String> readDatabase() {
        List<String> dbRead = new ArrayList<>();
        try {
            File file = new File(dbFile);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            if (line != null) {
                dbRead.add(line);
            }
//            String line = "";
            while (line != null) {
                // считываем остальные строки в цикле
                line = reader.readLine();
                if (line != null) {
                    dbRead.add(line);
                }
            }
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dbRead;
    }

}
