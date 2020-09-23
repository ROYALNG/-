package oj;

import java.util.Arrays;
import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = scanner.next();
        }
        Arrays.sort(s);
        System.out.println(String.join(" ",s));
    }
}
