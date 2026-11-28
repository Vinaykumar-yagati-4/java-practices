import java.util.Scanner;

public class CutTheRods {
    public static long solve(int n, long k, long l, long[] rods){
        long base = 0;
        long extra = 0;

        for(int i = 0; i < n; i++){
            if(rods[i] >= l){
                base++;

                extra+= (rods[i] / l) -1;
            }
        }
        return base + Math.min(k,extra);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();
        long l = sc.nextLong();

        long[] rods = new long[n];

        for(int i = 0; i < n; i++){
            rods[i] = sc.nextLong();
        }

        System.out.println(solve(n,k,l,rods));

        sc.close();
    }
}
