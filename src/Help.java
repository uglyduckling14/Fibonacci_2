public class Help {
    public static void print(){
        printHelp();
    }
    public static void isInt(String arg){
        invalid(arg);
    }
    private static void printHelp() {
        System.out.println("--- Assign 1 Help ---");
        System.out.println(" -fib [n] : Computes the Fibonacci of n; n must be 0-40");
        System.out.println(" -fac [n] : Computes the Factorial of n; n must be 0-" + Integer.MAX_VALUE);
        System.out.println(" -e [n] : Computes the value of 'e' using n iterations; n must be 1-" + Integer.MAX_VALUE);
    }
    private static void invalid(String arg){
        System.out.println("Error! Invalid argument: "+ arg);
        System.out.println("");
    }
}
