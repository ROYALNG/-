package oj;

import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t>0){
            int sum = 0;
            int n = scanner.nextInt();
            for(int i=0;i<n;i++){
                sum += scanner.nextInt();
            }
            System.out.println(sum);
            t--;
        }
    }
}
