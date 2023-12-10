package com.designpattern.behavioral.strategydesignpattern.imlementation;

import com.designpattern.behavioral.strategydesignpattern.strategy.SportsDriveStrategy;

/**
 * @author Mayuri
 */
public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
