package Factory;

public class CallFactory {

    public static void main(String[] args){
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("CIRCLE");
        circle.draw();

        Shape square = factory.getShape("SQUARE");
        square.draw();

        Shape rectangle = factory.getShape("RECTANGLE");
        rectangle.draw();
    }
}
