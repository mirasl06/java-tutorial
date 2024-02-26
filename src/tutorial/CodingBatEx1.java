public class CodingBatEx1 {
    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (cigars >= 40 && cigars <= 60) {
            return true;
        }
        else if(cigars >= 40 && isWeekend){
            return true;
        }
        return false;
    }

}
