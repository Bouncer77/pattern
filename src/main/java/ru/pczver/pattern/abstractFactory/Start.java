package ru.pczver.pattern.abstractFactory;

import ru.pczver.pattern.abstractFactory.factory.impl.RussiaFactory;
import ru.pczver.pattern.abstractFactory.factory.interfaces.TransportFactory;
import ru.pczver.pattern.abstractFactory.transport.interfaces.Aircraft;

public class Start {

    public static void main(String[] args) {
        TransportFactory russiaFactory = new RussiaFactory();
        Aircraft aircraft = russiaFactory.createAircraft();
        aircraft.flight();
    }
}
