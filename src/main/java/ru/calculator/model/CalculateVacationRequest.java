package ru.calculator.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CalculateVacationRequest {
    @NotNull
    @Min(0)
    Double averageSalary;
    @NotNull
    @Min(0)
    @Max(365)
    Integer vacationDays;
    @NotBlank
    String holidayStartDate;

}
