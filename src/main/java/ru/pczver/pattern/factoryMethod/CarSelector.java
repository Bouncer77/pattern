package ru.pczver.pattern.factoryMethod;

public class CarSelector {

    // Singleton
    public static final CarSelector carSelector = new CarSelector();

    private CarSelector() {
    }

    public static synchronized CarSelector getInstance() {
        return carSelector;
    }

    // Фабричный метод - создает все типы автомобилей
    public Car getCar(RoadType roadType) {
        Car car = null;

        switch (roadType) {
            case CITY -> car = new Porsche();
            case OFF_ROAD -> car = new Jeep();
            case GRASS -> car = new GolfCar();
        }
        return car;
    }
}
