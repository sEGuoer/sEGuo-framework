package com.sEGuo.autoWired.otherPosition;

import org.springframework.beans.factory.annotation.Autowired;

public class Plane {
    Boss boss;
    Car car;

    public Plane(@Autowired
                 Boss boss) {
        this.boss = boss;
    }

    public Boss getBoss() {
        return boss;
    }

    public Car getCar() {
        return car;
    }

    @Autowired
    public void setCar(Car car) {
        this.car = car;
    }
}
