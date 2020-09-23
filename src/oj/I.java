package oj;

import java.util.Arrays;
import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String[] s = scanner.nextLine().split(" ");
            Arrays.sort(s);
            System.out.println(String.join(" ",s));
        }
    }
}
