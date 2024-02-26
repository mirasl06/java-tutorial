public class Ex2 {
    public static void main(String[] args) {
        String ussd = "*100 #";
        String massage;
        switch (ussd) {
            case "*100#":
                massage = "Balans";
                break;
            case "*101#":
                massage = "Settins";
                break;
            case "*102#":
                massage = "Cashback";
                break;
            case "*103#":
                massage = "Limits";
                break;
            case "*104#":
                massage = "Trafics";
                break;
            default:
                massage = "false";
                break;
        }
        System.out.println(massage);
    }
}
