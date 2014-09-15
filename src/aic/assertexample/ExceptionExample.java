package aic.assertexample;

class ExceptionExample {
    public static void main(String args[]) {
        int d, a;
        try { // monitor a block of code.
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed.");
            /*
                BufferedReader bf = new BufferedReader(new FileReader("no_exist_file.txt"));
            */
        } catch (ArithmeticException e) { // catch divide-by-zero error
            System.out.println("Catch Exception: Division by zero.");
            System.out.println(e.getMessage());
        }
        System.out.println("After catch statement.");
    }
}