package Task8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task8 {
    public static void main(String[] args) throws IOException {
        File inputFile1 = new File("D:\\Java\\Homework4\\src\\Task8\\INPUT_1");
        File inputFile2 = new File("D:\\Java\\Homework4\\src\\Task8\\INPUT_2");
        File outputFile = new File("D:\\Java\\Homework4\\src\\Task8\\OUTPUT");
        List<String> list1 = new ArrayList<>();

        try (FileReader fr = new FileReader(inputFile1)) {
            try (FileReader fr2 = new FileReader(inputFile2)) {
                try (FileWriter fw = new FileWriter(outputFile)) {

                    BufferedReader reader = new BufferedReader(fr);
                    BufferedReader reader2 = new BufferedReader(fr2);
                    String line1 = reader.readLine();
                    String line2 = reader2.readLine();

                    while (line1 != null) {
                        list1.add(line1);
                        line1 = reader.readLine();
                    }
                    while (line2 != null) {
                        for (String word : list1) {
                            if (line2.equals(word)) {
                                fw.write(word);
                                fw.append("\n");
                            }
                        }
                        line2 = reader2.readLine();
                    }
                    reader.close();
                    fw.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
