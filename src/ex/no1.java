package ex;

import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {

        int[] a = new int[1005];
        int[] c = new int[1005];
        int[] d = new int[1005];
        int n = 0,m = 0,x = 0;

        int ans = 0;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                x = sc.nextInt();
                if(x>a[i]){
                    d[i] = a[i];
                    a[i] = x;
                    c[i] = j;
                }else if(x > d[i]){
                    d[i] = x;
                }
            }
        }

        for(int i=1;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(c[i] != c[j]){
                    ans = Math.max(ans,a[i]*a[j]);
                }else{
                    ans = Math.max(ans,a[i]*d[j]);
                    ans = Math.max(ans,d[i]*a[j]);
                }
            }
        }
        System.out.println(ans);
    }
}
