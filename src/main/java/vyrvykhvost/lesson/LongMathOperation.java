package main.java.vyrvykhvost.lesson;

public class LongMathOperation extends Operation {
    /**
     * TODO: 1. simple java types
     *     //TODO: 2. Classes
     * TODO: 3. OOP
     *          3.1 Inheritance
     *          3.2 Polymorphism
     */

    public Number sum(Number a, Number b){
        System.err.println("This is " + getClass());
        if (a instanceof Long || b instanceof Long) {
            return a.longValue()+ b.longValue();
        }
        return null;
    }

    public Number multiplication(Number a, Number b){
        System.err.println("This is " + getClass());
        if (a instanceof Long || b instanceof Long) {
            return multiplication(a.longValue(), b.longValue());
        }
        return null;
    }

    public Long multiplication(Long a, Long b){
        return a*b;
    }

    public Number divide(Number a, Number b){
        System.err.println("This is " + getClass());
        String message = "You can't divide by zero";
        long ZERO_NUMBER = 0;
        Long result = ZERO_NUMBER;
        if(b.longValue() == ZERO_NUMBER){
            System.out.println(message);
            return result;
//            throw new ArithmeticException(message);
        }
        if (a instanceof Long || b instanceof Long) {
            return a.longValue() / b.longValue();
        }
        return null;
    }


    public Number difference(Number a, Number b){
        System.err.println("This is " + getClass());
        if (a instanceof Long || b instanceof Long) {
            return a.longValue() - b.longValue();
        }
        return null;
    }

   
}
