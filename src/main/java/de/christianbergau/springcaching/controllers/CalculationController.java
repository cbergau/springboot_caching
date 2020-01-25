package de.christianbergau.springcaching.controllers;

import de.christianbergau.springcaching.services.CalculationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    private final CalculationService service;

    public CalculationController(CalculationService service) {
        this.service = service;
    }

    @GetMapping("/{n1}/{n2}")
    public String calc(@PathVariable final String n1, @PathVariable final String n2) {
        return String.valueOf(service.calculateSomethingBig(Double.parseDouble(n1), Double.parseDouble(n2)));
    }
}
