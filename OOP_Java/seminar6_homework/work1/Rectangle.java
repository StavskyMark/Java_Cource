package OOP_Java.seminar6_homework.work1;

abstract class AbstractFigure {  // Высоту определяем только у прямоугольника, для квадрата достаточно ширины (width)
    int width;
    public String getType() {
        return "Геометрическая фигура";
    }
}

interface Heigth {                // Например - для площади, в каких-то фигурах может использоваться, а в каких-то нет
    int setSquare();
}

class Rectangle extends AbstractFigure implements Heigth {
    int heigth;
    public String getType() {
        return "Прямоугольник";
    }
    public void setWidth(int width) { this.width = width; }
    public void setHeigth(int heigth) { this.heigth = heigth; }
    @Override
    public int setSquare() { return width*heigth; }
}

class Square extends AbstractFigure {
    public String getType() {
        return "Квадрат";
    }
    public void setWidth(int width) { this.width = width; }
    public int setSquare() { return width*width; }

}
