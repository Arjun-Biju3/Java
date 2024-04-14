 class Circle{
    float radius;

    Circle() {
        this.radius = 1;
    }

    Circle(float radius) {
        this.radius = radius;
    }

    float calculateCircumference() {
        return (float) (2 * Math.PI * radius);
    }

    float getRadius() {
        return radius;
    }

    void setRadius(float radius) {
        this.radius = radius;
    }
}
class ExpNo1{

    public static void main(String arg[]) {
        Circle c1 = new Circle();
        System.out.println("Default Circle Radius: " + c1.getRadius());

        Circle c2= new Circle(5);
        System.out.println("Parameterized Circle Radius: " + c2.getRadius());

        System.out.println("Circumference: " + c2.calculateCircumference());
    }
}
