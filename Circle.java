//write a class circle containing private variable radius of type float, suitable constructors and 2 methods, findarea and findcircumstance of circles respectively. write a separate class mycircle containing main method to create and use circle objects.
public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float findArea() {
        return (float) (Math.PI * radius * radius);
    }

    public float findCircumference() {
        return (float) (2 * Math.PI * radius);
    }
}