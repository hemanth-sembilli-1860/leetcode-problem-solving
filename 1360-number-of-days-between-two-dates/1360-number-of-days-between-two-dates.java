import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return (int)Math.abs(ChronoUnit.DAYS.between(LocalDate.parse(date1),LocalDate.parse(date2)));
    }
}