public class Circle {

    double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public void printSize()
    {
        System.out.println("circle size is " + radius*2*Math.PI);
    }


}
