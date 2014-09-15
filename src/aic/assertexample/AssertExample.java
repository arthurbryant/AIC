package aic.assertexample;

public class AssertExample {
    public static void main(String[] args) {
        int x = 10;
        if (args.length > 0) {
            try {
                x = Integer.parseInt(args[0]);
                assert x == 10 : "Our assertion failed";
            }
            catch (AssertionError error) {
                System.out.println(error.getMessage());
            }
            catch (NumberFormatException nfe) {
                System.out.println("Please input a number!");
            }
        }
        System.out.println("Testing assertion that x == 10");
        System.out.println("Test passed");
    }
}
