package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class isSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE); // 예외발생
        System.out.println("minute = " + minute);
    }
}
