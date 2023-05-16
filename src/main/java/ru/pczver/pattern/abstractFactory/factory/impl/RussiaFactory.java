package ru.pczver.pattern.abstractFactory.factory.impl;

import org.springframework.cglib.proxy.Factory;
import ru.pczver.pattern.abstractFactory.factory.interfaces.TransportFactory;
import ru.pczver.pattern.abstractFactory.transport.impl.aircraft.TU134;
import ru.pczver.pattern.abstractFactory.transport.impl.car.Niva;
import ru.pczver.pattern.abstractFactory.transport.interfaces.Aircraft;
import ru.pczver.pattern.abstractFactory.transport.interfaces.Car;

public class RussiaFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
