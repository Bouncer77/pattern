package ru.pczver.pattern.factoryMethod;

public class CarSelector {

    // Фабричный метод - создает все типы автомобилей
    public Car getCar(RoadType roadType) {
        Car car = null;

        switch (roadType) {
            case CITY -> car = new Porsche();
            case OFF_ROAD -> car = new Geep();
            case GRASS -> car = new GolfCar();
        }
        return car;
    }
}
