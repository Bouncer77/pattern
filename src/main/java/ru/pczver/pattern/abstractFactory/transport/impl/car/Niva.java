package ru.pczver.pattern.abstractFactory.transport.impl.car;


import ru.pczver.pattern.abstractFactory.transport.interfaces.Car;

public class Niva implements Car {

    @Override
    public String toString() {
        return "GolfCar{}";
    }

    @Override
    public void drive() {
        System.out.println("Niva is drive");
    }

    @Override
    public void stop() {

    }
}
