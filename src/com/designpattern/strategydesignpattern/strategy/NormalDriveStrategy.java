package com.designpattern.strategydesignpattern.strategy;

/**
 * @author Mayuri
 */
public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal drive strategy...");
    }
}
