package com.designpattern.behavioral.strategydesignpattern;

import com.designpattern.behavioral.strategydesignpattern.imlementation.NormalVehicle;
import com.designpattern.behavioral.strategydesignpattern.imlementation.SportsVehicle;
import com.designpattern.behavioral.strategydesignpattern.imlementation.Vehicle;

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
