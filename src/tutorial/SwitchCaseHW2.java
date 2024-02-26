public class SwitchCaseHW2 {
    public static void main(String[] args) {
        String carProducts = "2";
        String a;
        switch (carProducts) {
            case "1":
                a = "Mercedes E class";
                break;
            case "2":
                a = "Mercedes S class";
                break;
            case "3":
                a = "Mercedes C class";
                break;
            case "4":
                a = "Mercedes A class";
                break;
            case "5":
                a = "Mercedes G class";
                break;
            default:
                a = "false";
                break;
        }
        System.out.println(a);
    }
}