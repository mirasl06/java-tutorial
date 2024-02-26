package Collection.drug;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileServiceImpl implements FileService {

    private final String FILE_NAME = "drug.txt";

    @Override
    public void write(Drug drug) {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File created!");
            }

            FileWriter fileWriter = new FileWriter(FILE_NAME, true);
            fileWriter.write(String.format("\n%s;%s",
                    drug.getName(), drug.getPrice()));
            fileWriter.close();

            System.out.println("File write successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Drug> drugList) {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File created!");
            }

            FileWriter fileWriter = new FileWriter(FILE_NAME, false);
            for (Drug drug : drugList) {
                fileWriter.write(String.format("\n%s;%s",
                        drug.getName(), drug.getPrice()));
            }

            if (drugList.isEmpty()) {
                fileWriter.write("");
            }

            fileWriter.close();

            System.out.println("File write successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Drug> read() {
        try {
            List<Drug> drugList = new ArrayList<>();

            File file = new File(FILE_NAME);
            if (!file.exists()) {
                System.out.println("File don't have");
                return drugList;
            }

            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                String line = fileReader.nextLine();

                if (!line.isEmpty()) {
                    String[] data = line.split(";");
                    String name = data[0];
                    String price = data[1];


                    drugList.add(new Drug(name, Integer.parseInt(price)));
                }
            }

            return drugList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
