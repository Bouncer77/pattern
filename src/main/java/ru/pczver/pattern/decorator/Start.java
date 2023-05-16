package ru.pczver.pattern.decorator;

import ru.pczver.pattern.decorator.decorators.BorderDecorator;
import ru.pczver.pattern.decorator.decorators.ColorDecorator;
import ru.pczver.pattern.decorator.objects.Component;
import ru.pczver.pattern.decorator.objects.TextView;
import ru.pczver.pattern.decorator.objects.Window;

public class Start {

    private static Component window;
    private static Component textView;

    public static void main(String[] args) {

        boolean isShowBorder = true;

        if (isShowBorder) {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
        } else {
            window = new Window();
            textView = new TextView();
        }

        window.draw();
        textView.draw();


//        Component window = new Window();
//        window.draw();
//        System.out.println();
//
//
//        Component windowWithBorder = new ColorDecorator(new BorderDecorator(new Window()));
//        windowWithBorder.draw();
//        System.out.println();
//
//        Component textView = new ColorDecorator(new TextView());
//        textView.draw();
    }
}
