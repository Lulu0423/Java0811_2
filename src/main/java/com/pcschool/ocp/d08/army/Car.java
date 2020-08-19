package com.pcschool.ocp.d08.army;

public abstract class Car {
    public Car() {   
        System.out.println("Car...");  
    }  
    abstract void move(); 

    void shoot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

