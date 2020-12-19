package main.java.vyrvykhvost.lesson;

public class DoubleMathOperation extends Operation {
    /**
     * TODO: 1. simple java types
     *     //TODO: 2. Classes
     * TODO: 3. OOP
     *          3.1 Inheritance
     *          3.2 Polymorphism
     */

    public Number sum(Number a, Number b){
        System.err.println("This is " + getClass());
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue()+ b.doubleValue();
        }
        return null;
    }

    public Number multiplication(Number a, Number b){
        System.err.println("This is " + getClass());
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() * b.doubleValue();
        }
        return null;
    }



    public Number divide(Number a, Number b){
        System.err.println("This is " + getClass());
        String message = "You can't divide by zero";
        Double ZERO_NUMBER = 0d;
        Double result = ZERO_NUMBER;
        if(b.doubleValue() == ZERO_NUMBER.intValue()){
            System.out.println(message);
            return result;
//            throw new ArithmeticException(message);
        }
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() / b.doubleValue();
        }
        return null;
    }


    public Number difference(Number a, Number b){
        System.err.println("This is " + getClass());
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        }
        return null;
    }

}
   

