package ru.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.calculator.constants.Constants.AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH;

public class CalculatorServiceTest {

    private final CalculateService calculateService = new CalculateService();

    @Test
    public void shouldCalculateVacationAmountCorrect() {
        double averageSalary = 100.0;
        int vacationDaysForService = 10;
        int vacationDaysForTest = 11;
        String date = "2021-02-21";

        Double result = averageSalary * vacationDaysForTest / AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH;
        Double serviceResult = calculateService.calculateVacation(averageSalary, vacationDaysForService, date);

        assertEquals(result, serviceResult, String.format("Expected '%f', but received '%f'", result, serviceResult));
    }

    @Test
    public void shouldCalculateVacationAmountIncorrect() {
        double averageSalary = 100.0;
        int vacationDaysForService = 10;
        int vacationDaysForTest = 12;
        String date = "2021-02-21";

        Double result = averageSalary * vacationDaysForTest / AVERAGE_NUMBER_OF_DAYS_IN_A_MONTH;
        Double serviceResult = calculateService.calculateVacation(averageSalary, vacationDaysForService, date);

        assertNotEquals(result, serviceResult, String.format("Expected not '%f', but received '%f'", result, serviceResult));
    }
}
