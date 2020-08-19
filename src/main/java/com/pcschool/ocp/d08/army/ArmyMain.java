package com.pcschool.ocp.d08.army;

import java.util.Arrays;

public class ArmyMain {

    public static void main(String[] args) {
        Airplane[] airplanes = {new Fighter(), new Fighter(), new Fighter()};
        Car[] cars = {new Tank(), new Tank(), new Tank()};
        Weapon[] weapons = {new Fighter(), new Fighter(), new Fighter()};
        // cars 統一發射武器
        for (Car car : cars) {
            if (car instanceof Tank) {
                ((Tank) car).shoot();
            }
            System.out.println("-------------");
            // weapons 統一發射武器
            for (Weapon w : weapons) {
                w.shoot();
            }
            System.out.println("-------------");
            // cars 統一發射武器 (java8)
            Arrays.stream(cars)
                    .filter(c -> c instanceof Weapon)
                    .map(c -> (Weapon) c)
                    .forEach(w -> w.shoot());

            System.out.println("-------------");
            // weapons 統一發射武器 (java8)
            Arrays.stream(weapons).forEach(w -> w.shoot());
            
        }
    }
}
