package ru.calculator.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

import static ru.calculator.constants.Constants.*;

@Service
public class CalculateService {

    public Double calculateVacation(Double averageSalary, Integer vacationDays, String holidayStartDate) {

        LocalDate startHolidays = LocalDate.parse(holidayStartDate);

        for (LocalDate startDate = startHolidays; startDate.isBefore(startHolidays.plusDays(vacationDays+1)); startDate = startDate.plusDays(1)) {
            if (HOLIDAYS.contains(LocalDate.of(YEAR,startDate.getMonthValue(),startDate.getDayOfMonth()))) {
                vacationDays++;
            }
        }

        return averageSalary * vacationDays / AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH;
    }
}
