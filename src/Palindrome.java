public class Palindrome {
    public static void main(String[] args) {

        //Bruteforce
//        int number = 121;
//        String original = String.valueOf(number);
//        String reversed = new StringBuilder(original).reverse().toString();
//        if(original.equals(reversed)){
//            System.out.println("palindrome" );
//        }else{
//            System.out.println("not palindrome");
//        }


        // optimized

        int num = 121;
        int original = num;
        int reversed = 0;

        while(num > 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if(original == reversed){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
