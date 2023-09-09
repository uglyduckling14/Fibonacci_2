import java.math.BigDecimal;
import java.math.BigInteger;

public class Assn2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            Help.print();
            return;
        }
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            switch (arg) {
                case "-fib" -> {
                    if (isValid(args[i + 1], 0, 40)) {
                        Fib fibonacci = new Fib(Integer.parseInt(args[i + 1]));
                        System.out.println("Fibonacci of " + args[i + 1] + " is " +
                                fibonacci.n);
                    } else {
                        Help.isInt(args[i + 1]);
                        Help.print();
                        return;
                    }
                    i++;
                }
                case "-fac" -> {
                    if (isValid(args[i + 1], 0, Integer.MAX_VALUE)) {
                        Fac factorial = new Fac(new BigInteger(args[i + 1]));
                        System.out.println("Factorial of " + args[i + 1] + " is " +
                                factorial.n);
                    } else {
                        Help.isInt(args[i + 1]);
                        Help.print();
                        return;
                    }
                    i++;
                }
                case "-e" -> {
                    if (isValid(args[i + 1], 1, Integer.MAX_VALUE)) {
                        E e = new E(new BigDecimal(args[i + 1]).subtract(BigDecimal.ONE), Integer.parseInt((args[i + 1])));
                        System.out.println("Value of e using " + args[i + 1] + " iterations is " +
                                e.n);
                    } else {
                        Help.isInt(args[i + 1]);
                        Help.print();
                        return;
                    }
                    i++;
                }
                default -> {
                    Help.isInt(arg);
                    return;
                }
            }
        }
    }



    private static boolean isValid(String arg, int min, int max) {
        return isInt(arg) != -1 && min <= isInt(arg) && max >= isInt(arg);
    }

    private static int isInt(String arg) {
        try {
            return Integer.parseInt(arg);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    //testing methods
    public static boolean isPubValid(String arg, int min, int max) {
        return isValid(arg, min, max);
    }

    public static int isPubInt(String arg) {
        return isInt(arg);
    }
}
