package Projects_OOP.Seminar06.SolidLsp;

import Projects_OOP.Seminar06.SolidLsp.lsp.Rectangle;
import Projects_OOP.Seminar06.SolidLsp.lsp.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Square(5);
        rectangle.setSideA(4);
        rectangle.setSideB(5);
        System.out.printf("В прямоугольнике сторона A = %d, сторона B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ViewShape view = new ViewShape(rectangle);
        view.showArea();
    }
}
