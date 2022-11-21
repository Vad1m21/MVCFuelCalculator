package com.vadim.FuelCalculator.Entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Data
@Component("gasStation")
@Scope("prototype")
@Entity
@Table(name = "gas_station")
public class GasStation {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment",strategy = "increment")
    @Column
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "a95Plus")
    private double a95Plus;
    @Column(name = "gas")
    private double gas;
    @Column(name = "a92")
     private double a92;
    @Column(name = "dp")
     private double dp;
    @Column(name = "a95")
    private  double a95;


}
