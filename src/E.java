import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;


public class E {
    BigDecimal n;
    public E(BigDecimal n, int power) {
        this.n = e(n, power);
    }
    private static BigDecimal e(BigDecimal n, int power) {
        BigDecimal result = BigDecimal.ONE;
        BigDecimal counter = n;

        while(counter.compareTo(BigDecimal.ONE)>(-1)){
            Fac factorial = new Fac(new BigInteger(String.valueOf(counter)));
            result = result.add(BigDecimal.ONE
                    .divide(new BigDecimal(factorial.n), new MathContext(20)), new MathContext(20));
            counter =counter.subtract(BigDecimal.ONE);
            power--;
        }
        return result;
    }
}
