package main.java.vyrvykhvost.lesson;

public class Main {
    public static void main(String[] args) {
        float a = 10;
        int b = 3;
        Operation operation = OperationFactory.getOperation(a,b);
        System.out.println("Sum ==>"            + operation.sum(a,b));
        System.out.println("Multiplication ==>" + operation.multiplication(a,b));
        System.out.println("Divide ==>"         + operation.divide(a,b));
        System.out.println("Difference ==>"     + operation.difference(a,b));
    }
}
