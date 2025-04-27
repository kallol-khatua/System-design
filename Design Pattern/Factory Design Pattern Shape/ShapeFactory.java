public class ShapeFactory {

    public Shape getShape(String name) {
        if(name == null) {
            return null;
        }

        if (name.equalsIgnoreCase("CIRCLE")) {
            return new CircleShape();
        }
        if (name.equalsIgnoreCase("TRIANGLE")) {
            return new TriangleShape();
        }

        return null;
    }

}
