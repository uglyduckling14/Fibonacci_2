public class Fib {
    int n;
    public Fib(int n){
        this.n = n;
        this.n = fibonacci(n);
    }
    private int fibonacci( int n){
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+ fibonacci(n-2);
    }
}
