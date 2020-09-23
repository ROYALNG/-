package ex;

import java.util.Scanner;

public class MoveString {

    private static String moveToLeft(String str,int position){
        String str1 = str.substring(position);
        String str2 = str.substring(0,position);
        return str1 + str2;
    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String leftString = scan.nextLine();

        int n = scan.nextInt();
        while(n > leftString.length()){
            n = n % leftString.length();
        }
        System.out.println(moveToLeft(leftString,n));
    }
}
