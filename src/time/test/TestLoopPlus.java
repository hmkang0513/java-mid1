package time.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {

        for(int i = 0; i <5; i++) {
            LocalDateTime dt = LocalDateTime.of(2024, 1, 1,0,0,0);
//            dt = dt.plusDays(14*i);
            dt = dt.plus(2 * i, ChronoUnit.WEEKS);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formatted = dt.format(dtf);
            System.out.println("날짜 " + (i+1) +": "+formatted);
        }
    }
}
