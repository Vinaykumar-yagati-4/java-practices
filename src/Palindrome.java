public class Palindrome {
    public static void main(String[] args) {
        int number = 123;
        String original = String.valueOf(number);
        String reversed = new StringBuilder(original).reverse().toString();
        if(original.equals(reversed)){
            System.out.println("palindrome" );
        }else{
            System.out.println("not palindrome");
        }
    }
}
