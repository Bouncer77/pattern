package ru.pczver.pattern.decorator.objects;

public class Window implements Component {
    @Override
    public void draw() {
        System.out.println("window component");
    }
}
