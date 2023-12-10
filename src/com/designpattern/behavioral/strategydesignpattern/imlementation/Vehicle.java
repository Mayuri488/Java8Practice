package com.designpattern.behavioral.strategydesignpattern.imlementation;

import com.designpattern.behavioral.strategydesignpattern.strategy.DriveStrategy;

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
