package hus.oop.lab9.library;

import java.time.LocalDate;
import java.util.Date;
import java.time.temporal.ChronoUnit;
public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {

        int longestDayRent = 0;
        for (int i = 1; i < rents.length; i++) {
            //int longestDayRent = 0;
            if (calculusDays(rents[i].begin, rents[i].end) > calculusDays(rents[longestDayRent].begin, rents[longestDayRent].end)) {
                longestDayRent = i;
            }
        }

        return rents[longestDayRent];
    }

    public int calculusDays(Date begin, Date end) {
        return end.compareTo(begin);
    }
}
