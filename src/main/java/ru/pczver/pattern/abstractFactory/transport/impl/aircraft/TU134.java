package ru.pczver.pattern.abstractFactory.transport.impl.aircraft;

import ru.pczver.pattern.abstractFactory.transport.interfaces.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("TU134");
    }
}
