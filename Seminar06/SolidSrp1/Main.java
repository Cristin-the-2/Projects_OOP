package Projects_OOP.Seminar06.SolidSrp1;

import Projects_OOP.Seminar06.SolidSrp1.srp.Point;
import Projects_OOP.Seminar06.SolidSrp1.srp.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        square.draw();
    }
}
