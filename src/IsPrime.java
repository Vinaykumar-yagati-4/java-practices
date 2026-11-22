public class IsPrime {
    public static void main(String[] args) {
        int num = 4;
        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }

        for(int i = 2;i < num;i++){
            if(num % 2 == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println("prime number");
        else
            System.out.println("not prime number");
    }
}
