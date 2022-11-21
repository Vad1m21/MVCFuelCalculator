package com.vadim.FuelCalculator.Entity;


import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
public class Fuel {
    private  Double price;

    private Double distance;

    private Integer peoples;

    private Double liters;

    private Integer sum;
}
