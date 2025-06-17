@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
public class LambdaWithParameters {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;
        System.out.println("Sum: " + addition.operate(10, 5));     
        System.out.println("Product: " + multiplication.operate(10, 5));
    }
}
