package de.christianbergau.springcaching.services;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class CalculationService {

    @Cacheable(
            cacheNames = "cacheOfBigCalculation",
            key = "{#numberOne,#numberTwo}"
    )
    public double calculateSomethingBig(double numberOne, double numberTwo) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Nothing big here, just for demo
        return numberOne * numberTwo;
    }
}
