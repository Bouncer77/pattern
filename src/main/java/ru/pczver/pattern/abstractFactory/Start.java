package ru.pczver.pattern.abstractFactory;

import ru.pczver.pattern.abstractFactory.factory.impl.RussiaFactory;
import ru.pczver.pattern.abstractFactory.factory.impl.USAFactory;
import ru.pczver.pattern.abstractFactory.factory.interfaces.TransportFactory;
import ru.pczver.pattern.abstractFactory.transport.interfaces.Aircraft;

public class Start {

    private static TransportFactory factory;

    public static void main(String[] args) {

        boolean isRussia = true;

        if (isRussia) {
            factory = new RussiaFactory();
        } else {
            factory = new USAFactory();
        }

        factory.createAircraft().flight();
        factory.createCar().drive();
    }
}
