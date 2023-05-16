package ru.pczver.pattern.factoryMethod;

public class FactoryMethod {

    public static void main(String[] args) {
        System.out.println("Фабричный метод");
        CarSelector carSelector = new CarSelector();

        Car car = carSelector.getCar(RoadType.OFF_ROAD);
        System.out.println(car);
    }
}
