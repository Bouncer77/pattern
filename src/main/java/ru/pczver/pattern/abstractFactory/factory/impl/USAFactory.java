package ru.pczver.pattern.abstractFactory.factory.impl;

import ru.pczver.pattern.abstractFactory.factory.interfaces.TransportFactory;
import ru.pczver.pattern.abstractFactory.transport.impl.car.Porsche;
import ru.pczver.pattern.abstractFactory.transport.interfaces.Aircraft;
import ru.pczver.pattern.abstractFactory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return null;
    }
}
