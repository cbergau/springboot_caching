package de.christianbergau.springcaching.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CalculationService {

    @Cacheable(cacheNames = "cacheOfBigCalculation")
    public double calculateSomethingBig(double numberOne, double numberTwo) {
        System.out.println("calculating ...");
        return numberOne * numberTwo;
    }
}
