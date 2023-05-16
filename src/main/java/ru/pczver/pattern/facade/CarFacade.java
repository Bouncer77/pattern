package ru.pczver.pattern.facade;

import ru.pczver.pattern.facade.parts.Door;
import ru.pczver.pattern.facade.parts.Ignition;
import ru.pczver.pattern.facade.parts.Wheel;

public class CarFacade {

    public void go() {
        Door door = new Door();
        door.open();

        Ignition ignition = new Ignition();
        ignition.fire();

        Wheel wheel = new Wheel();
        wheel.turn();
    }
}
