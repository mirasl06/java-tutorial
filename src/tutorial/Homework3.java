public class Homework3 {
    public static void main(String[] args) {
        int shashlik = 15000;
        int shorva = shashlik - 5000;
        int somsa = (shashlik + shorva) / 2;
        System.out.println("Somsaning` Narxi " + somsa);
        int hammasi = shashlik + shorva + somsa;
        System.out.printf("Hammasini sotib olish uchun " + hammasi + " so`m kerak\n");
        System.out.printf("Hammasini sotib olish uchun %s so`m kerak", hammasi);
    }
}
