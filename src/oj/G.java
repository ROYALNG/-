package oj;

import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int sum = 0;
            String[] str = scanner.nextLine().split(" ");
            for (String s:str) {
                sum += Integer.parseInt(s);
            }
            System.out.println(sum);
        }
    }
}
