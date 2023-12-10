package com.designpattern.strategydesignpattern.imlementation;

import com.designpattern.strategydesignpattern.strategy.DriveStrategy;
import com.designpattern.strategydesignpattern.strategy.SportsDriveStrategy;

/**
 * @author Mayuri
 */
public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(new SportsDriveStrategy());
    }
}
