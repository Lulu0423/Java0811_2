package com.pcschool.ocp.d08.army;

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
            // weapons 統一發射武器
            for (Weapon w : weapons) {
                w.shoot();
            }
            // cars 統一發射武器 (java8)
            for (Car c : cars) {
                c.shoot();
            }
            // weapons 統一發射武器 (java8)
            for (Weapon w : weapons) {
                w.shoot();
            }
        }
    }
}
