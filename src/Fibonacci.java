public class Fibonacci {
    public static void main(String[] args) {

        //optimized
        int n = 10;
        int a = 0 , b = 1;

        for(int i = 1; i <= n; i++){
            System.out.println(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

//class FibonacciRecursion{
//    static int fibonacci(int n){
//        if(n <= 1){
//            return n;
//        }
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
//
//    public static void main(String[] args) {
//        int n = 10;
//        for(int i = 0; i < n; i++) {
//            System.out.println(fibonacci(i) + " ");
//        }
//    }
//}
