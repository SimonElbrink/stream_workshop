package se.lexicon.vxo.util;

import java.time.LocalDate;
import java.time.Year;
import java.util.stream.Stream;

public class UsefulMethods {

    public LocalDate[] generateYearOf(int year) {
        return Stream.iterate(LocalDate.ofYearDay(year,1), localDate -> localDate.plusDays(1))
                .limit(Year.of(year).isLeap() ? 366 : 365)
                .toArray(LocalDate[]::new);
    }
}
