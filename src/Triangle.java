/**
 * Created by VitaliyS on 11/11/2016.
 */
public class Triangle {
    Triangle(double a, double b) {
        super(a, b);
    }

    // переопределяем метод
    double area() {
        System.out.println("Площадь треугольника");
        return dim1 * dim2 / 2;
    }

    public static void main(String[] args) {
        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(8, 5);
        Triangle triangle = new Triangle(10, 6);

        Figure fig;

        fig = figure;
        mInfoTextView.setText("Площадь равна " + fig.area);

        fig = rectangle;
        mInfoTextView.setText("Площадь равна " + fig.area);

        fig = triangle;
        mInfoTextView.setText("Площадь равна " + fig.area);
    }
}