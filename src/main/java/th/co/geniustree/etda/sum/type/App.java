
package th.co.geniustree.etda.sum.type;

/**
 *
 * @author pramoth
 */
public class App {

    public static void main(String[] args) {
        Shape shape = new Circle();
        printShape(shape);
    }
    static void printShape(Shape shape){
        switch (shape) {
            case Circle()  -> System.out.println("Circle");
            case Rectangle() -> System.out.println("Circle");
            case Oval() -> System.out.println("Oval");
        }
    }
}
