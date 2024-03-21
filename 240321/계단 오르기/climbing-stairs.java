import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=0;
        dp[2]=1;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-2] %10007+ dp[i-3] % 10007;
        }
        System.out.print(dp[n]);
    }
}