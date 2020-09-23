package offer;

public class off10_1 {
    private int[] fib = new int[40];

    public void solution(){

        fib[1] = 1;
        for(int i=2;i<fib.length;i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
    }

    public int Fibonacci(int n){
        return fib[n];
    }
}
