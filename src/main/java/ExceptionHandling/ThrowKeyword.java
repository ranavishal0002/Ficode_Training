package ExceptionHandling;


public class ThrowKeyword {

    public static void checkage(int age) throws ArithmeticException{
        if(age<18){
            throw new ArithmeticException("Access denied- you must be at least 18");
        } else {
            System.out.println("Access granted- you are old enough to vote");
        }
    }
    public static void main(String[] args) {
        try {
            checkage(15);
        } catch (ArithmeticException e){
            System.out.println("Exception caugh here: "+ e.getMessage());
        }

    }
}
