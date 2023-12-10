package com.designpattern.strategydesignpattern.imlementation;

import com.designpattern.strategydesignpattern.strategy.DriveStrategy;
import com.designpattern.strategydesignpattern.strategy.SportsDriveStrategy;

/**
 * @author Mayuri
 */
public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
