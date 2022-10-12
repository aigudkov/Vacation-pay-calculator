package ru.calculator.constants;

import java.time.LocalDate;
import java.util.Set;

public class Constants {
    public static final double AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH = 29.3;
    public static final int YEAR = 2022;
    public static final Set<LocalDate> HOLIDAYS = Set.of(LocalDate.of(YEAR,1,1),
            LocalDate.of(YEAR,1,2),
            LocalDate.of(YEAR,1,3),
            LocalDate.of(YEAR,1,4),
            LocalDate.of(YEAR,1,5),
            LocalDate.of(YEAR,1,6),
            LocalDate.of(YEAR,1,7),
            LocalDate.of(YEAR,1,8),
            LocalDate.of(YEAR,2,23),
            LocalDate.of(YEAR,3,8),
            LocalDate.of(YEAR,5,1),
            LocalDate.of(YEAR,5,9),
            LocalDate.of(YEAR,6,12),
            LocalDate.of(YEAR,11,4)
            );
}
