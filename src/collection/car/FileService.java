package collection.car;

import java.util.List;

public interface FileService {

    /**
     * Faylga ma'lumotlarni yozish uchun
     * Fayl kengaytmasi: .txt
     * Formati: name;price;color
     *
     * @param cars Cars
     */
    void write(Cars cars);

    void write(List<Cars> carsList);

    /**
     * Bu metod faylni o`qib undagi ma'lumotlarni Collection(List) ga aylantirishi kerak
     */
    List<Cars> read();
}
