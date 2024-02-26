package collection.drug;

import java.util.List;

public interface FileService {

    void write(Drug drug);

    void write(List<Drug> drugList);

    List<Drug> read();
}
