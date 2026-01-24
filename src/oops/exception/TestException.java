package oops.exception;

public class TestException {
    public static void main(String[] args) {

        // Run Time Exception

        try {

            int x = 2;
            int y = 10;
            int z = y / x;

            int[] num = new int[5];
            num[5]=1000;
        }catch (ArithmeticException e)
        {
            System.out.println("Something went wrong");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Issue");
        }catch(Exception e){ // used when you dont know what kind of exception to be used
                System.out.println("Went wrong");
        }finally {
            System.out.println("Will get executed no matter what");
        }




    }
}
