package com.designpattern.strategydesignpattern.imlementation;

import com.designpattern.strategydesignpattern.strategy.DriveStrategy;

/**
 * @author Mayuri
 */
public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
