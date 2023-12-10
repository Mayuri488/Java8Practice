package com.designpattern.strategydesignpattern.strategy;

/**
 * @author Mayuri
 */
public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports drive strategy");
    }
}
