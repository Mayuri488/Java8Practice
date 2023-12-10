package com.designpattern.strategydesignpattern;

import com.designpattern.strategydesignpattern.imlementation.NormalVehicle;
import com.designpattern.strategydesignpattern.imlementation.SportsVehicle;
import com.designpattern.strategydesignpattern.imlementation.Vehicle;

/**
 * @author Mayuri
 */
public class MainClient {
    public static void main(String[] args) {
        Vehicle vehicle =  new SportsVehicle();
        vehicle.drive();
        Vehicle vehicle1 = new NormalVehicle();
        vehicle1.drive();
    }
}
