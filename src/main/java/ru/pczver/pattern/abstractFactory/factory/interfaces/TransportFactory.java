package ru.pczver.pattern.abstractFactory.factory.interfaces;

import ru.pczver.pattern.abstractFactory.transport.interfaces.Aircraft;
import ru.pczver.pattern.abstractFactory.transport.interfaces.Car;

public interface TransportFactory {

    Car createCar();

    Aircraft createAircraft();
}
