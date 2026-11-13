// public class Factorial {
//    public static void main(String[] args) {
//        //bruteforce
//        int n = 5;
//        int fact = 1;
//        for(int i = 1; i <= n; i++){
//            fact = fact * i;
//        }
//        System.out.println("Factorial :" +fact);
//    }
//}

class FactorialOptimized {
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial :" +factorial(n));

    }
}
