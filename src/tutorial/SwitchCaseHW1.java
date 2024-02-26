public class SwitchCaseHW1 {
    public static void main(String[] args) {
        String months = "51";
        String a;
        switch (months) {
            case "1":
                a = "January";
                break;
            case "2":
                a = "February";
                break;
            case "3":
                a = "March";
                break;
            case "4":
                a = "April";
                break;
            case "5":
                a = "May";
                break;
            case "6":
                a = "June";
                break;
            case "7":
                a = "Jule";
                break;
            case "8":
                a = "August";
                break;
            case "9":
                a = "September";
                break;
            case "10":
                a = "October";
                break;
            case "11":
                a = "November";
                break;
            case "12":
                a = "December";
                break;
            default:
                a = "false";
                break;
        }
        System.out.println(a);
    }
}
