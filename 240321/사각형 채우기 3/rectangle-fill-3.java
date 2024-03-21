import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp = new int[n+1];
        dp[1]=2;
        for(int i=2; i<=n; i++){
            for(int j=1; j<n; j++){
                dp[i]+=dp[j]*Math.floorDiv(i,j);
            }
            if(i%2==0) dp[i]+=3;
            else dp[i]+=2;
            dp[i]%=1000000007;
        }
        System.out.print(dp[n]%1000000007);
    }
}