/**
 * Created by caingmico on 09/06/2017.
 */
public class LeapYear {
    public static boolean main() {
        int year = 2000;
        if (year % 400 == 0) {
            return true;
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                return true;
            }
            return false;
        }
    }
}
