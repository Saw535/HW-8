public class Main {
    public static void main(String[] args) {
        // Об'єкт графічного редактора
        GraphicsEditor editor = new GraphicsEditor();

        // Об'єкти фігур
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape pentagon = new Pentagon();

        // Виводимо назву кожної фігури
        editor.printShapeName(circle);
        editor.printShapeName(square);
        editor.printShapeName(triangle);
        editor.printShapeName(rectangle);
        editor.printShapeName(pentagon);
    }
}
