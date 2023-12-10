package com.designpattern.behavioral.strategydesignpattern.imlementation;

import com.designpattern.behavioral.strategydesignpattern.strategy.NormalDriveStrategy;

/**
 * @author Mayuri
 */
public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
