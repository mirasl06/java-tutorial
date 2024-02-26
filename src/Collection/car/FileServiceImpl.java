package Collection.car;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileServiceImpl implements FileService {

    private final String FILE_NAME = "cars.txt";

    @Override
    public void write(Cars cars) {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File created!");
            }

            FileWriter fileWriter = new FileWriter(FILE_NAME, true);
            fileWriter.write(String.format("\n%s;%s;%s",
                    cars.getName(), cars.getPrice(), cars.getColor()));
            fileWriter.close();

            System.out.println("File write successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void write(List<Cars> carsList) {
        try {
            File file = new File(FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File created!");
            }

            FileWriter fileWriter = new FileWriter(FILE_NAME, false);
            for (Cars cars : carsList) {
                fileWriter.write(String.format("\n%s;%s;%s",
                        cars.getName(), cars.getPrice(), cars.getColor()));
            }

            if (carsList.isEmpty()) {
                fileWriter.write("");
            }

            fileWriter.close();

            System.out.println("File write successfully");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Cars> read() {
        try {
            List<Cars> carsList = new ArrayList<>();

            File file = new File(FILE_NAME);
            if (!file.exists()) {
                System.out.println("File don't have");
                return carsList;
            }

            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                String line = fileReader.nextLine();

                if (!line.isEmpty()) {
                    String[] data = line.split(";");
                    String name = data[0];
                    String price = data[1];
                    String color = data[2];

                    carsList.add(new Cars(name, Integer.parseInt(price), color));
                }
            }

            return carsList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

