package oj;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int sum = 0;
            int n = scanner.nextInt();
            if(n==0)
                break;;
             for(int i=0;i<n;i++)
                 sum += scanner.nextInt();
            System.out.println(sum);
        }


    }
}
