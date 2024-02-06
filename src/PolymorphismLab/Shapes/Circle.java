package PolymorphismLab.Shapes;

import static java.lang.Math.PI;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius) {
        this.setRadius(radius);
        this.calculatePerimeter();
        this.calculateArea();
    }

    public final Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculatePerimeter() {
       setPerimeter(2*PI*radius);
    }

    @Override
    protected void calculateArea() {
       setArea(PI * (radius*radius));
    }
}
