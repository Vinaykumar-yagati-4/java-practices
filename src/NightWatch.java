import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class NightWatch {
    public static long solve(int n, int w, long[] points, int[] storm){
        long total = 0;

        for(long p : points){
            total += p;
        }

        long[] dp = new long[n];
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(-1);

        for(int i = 0; i < n; i++){
            while(!dq.isEmpty() && dq.peekFirst() < i - w){
                dq.pollFirst();
            }
            if(storm[i] == 1){
                continue;
            }
            if(!dq.isEmpty()){
               int prev = dq.peekFirst();
               long cost = (prev == -1) ? 0 : dp[prev];
                dp[i] = points[i] + cost;

                while(!dq.isEmpty() && dq.peekLast() != -1 && dp[dq.peekLast()] >= dp[i]){
                    dq.pollLast();
                }

                dq.addLast(i);
           }
        }

        while(!dq.isEmpty() && dq.peekFirst() < n - w){
            dq.pollFirst();
        }

        if(dq.isEmpty()){
            return -1;
        }
        int last = dq.peekFirst();
        long minCost = (last == -1) ? 0 : dp[last];

        return total - minCost;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int w = sc.nextInt();

        long[] points = new long[n];
        int[] storm = new int[n];

        for(int i = 0; i < n; i++){
            points[i] = sc.nextLong();
        }

        for(int i = 0; i < n; i++){
            storm[i] = sc.nextInt();
        }

        System.out.println(solve(n, w, points, storm));

        sc.close();

    }
}