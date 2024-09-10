package com.dt5gen.neoflexvacation.calcapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VacationController {

    @GetMapping("/calculate")
    public double calculateVacationPay(
            @RequestParam double averageSalary,
            @RequestParam int vacationDays
    ) {
        return (averageSalary / 29.3) * vacationDays;
    }
}
