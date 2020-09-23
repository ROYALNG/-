package oj;

import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            String[] sa = s.split(" ");
            int sum = 0;
            for (int i = 0; i < sa.length; ++i) {
                sum += Long.parseLong(sa[i]);
            }
            System.out.println(sum);
        }
    }
}
