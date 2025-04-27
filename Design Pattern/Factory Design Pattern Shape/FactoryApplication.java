public class FactoryApplication {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape s1 = sf.getShape("CIRCLE");
        s1.draw();

        Shape s2 = sf.getShape("TRIANGLE");
        s2.draw();
    }
}
