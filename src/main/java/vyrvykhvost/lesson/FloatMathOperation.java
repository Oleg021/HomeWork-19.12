package main.java.vyrvykhvost.lesson;

public class FloatMathOperation extends Operation {
    /**
     * TODO: 1. simple java types
     *     //TODO: 2. Classes
     * TODO: 3. OOP
     *          3.1 Inheritance
     *          3.2 Polymorphism
     */

    public Number sum(Number a, Number b){
        System.err.println("This is " + getClass());
        if (a instanceof Float|| b instanceof Double) {
            return a.floatValue()+ b.floatValue();
        }
        return null;
    }

    public Number multiplication(Number a, Number b){
        System.err.println("This is " + getClass());
        if (a instanceof Float|| b instanceof Double) {
            return a.floatValue() * b.floatValue();
        }
        return null;
    }



    public Number divide(Number a, Number b){
        System.err.println("This is " + getClass());
        String message = "You can't divide by zero";
        float ZERO_NUMBER = 0;
        Float result = ZERO_NUMBER;
        if(b.floatValue() == ZERO_NUMBER){
            System.out.println(message);
            return result;
//            throw new ArithmeticException(message);
        }
        if (a instanceof Float|| b instanceof Double) {
            return a.floatValue() / b.floatValue();
        }
        return null;
    }


    public Number difference(Number a, Number b){
        System.err.println("This is " + getClass());
        if (a instanceof Float|| b instanceof Double) {
            return a.floatValue() - b.floatValue();
        }
        return null;
    }

}
