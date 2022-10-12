package ru.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.calculator.model.CalculateVacationRequest;
import ru.calculator.model.CalculateVacationResponse;
import ru.calculator.service.CalculateService;

import javax.validation.Valid;

@RestController
@RequestMapping("/calculate")
public class CalculateController {

    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public CalculateVacationResponse calculateVacation(@Valid CalculateVacationRequest request) {
        return CalculateVacationResponse.builder()
                .amount(calculateService.calculateVacation(request.getAverageSalary(), request.getVacationDays(), request.getHolidayStartDate()))
                .build();
    }
}
