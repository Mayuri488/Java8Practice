package com.designpattern.strategydesignpattern.imlementation;

import com.designpattern.strategydesignpattern.strategy.DriveStrategy;
import com.designpattern.strategydesignpattern.strategy.NormalDriveStrategy;

/**
 * @author Mayuri
 */
public class NormalVehicle extends Vehicle{
    public NormalVehicle(DriveStrategy driveStrategy) {
        super(new NormalDriveStrategy());
    }
}
