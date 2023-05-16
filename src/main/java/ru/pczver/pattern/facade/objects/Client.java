package ru.pczver.pattern.facade.objects;

import ru.pczver.pattern.facade.CarFacade;

public class Client {

    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
