package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadCSVFile {
    public static ArrayList<String> read(String filePath){
        ArrayList<String> linklist = new ArrayList<>();
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader(filePath));

            // How to read file in java line by line?
            while ((line = br.readLine()) != null) {
                linklist.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
        return linklist;
    }

}
