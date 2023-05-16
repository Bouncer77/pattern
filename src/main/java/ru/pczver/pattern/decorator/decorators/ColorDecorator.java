package ru.pczver.pattern.decorator.decorators;

import ru.pczver.pattern.decorator.objects.Component;

public class ColorDecorator extends Decorator {

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... add color");
    }
}
