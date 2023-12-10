package com.designpattern.behavioral.strategydesignpattern.imlementation;

import com.designpattern.behavioral.strategydesignpattern.strategy.SportsDriveStrategy;

/**
 * @author Mayuri
 */
public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
