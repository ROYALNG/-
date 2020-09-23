package ex;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in); //使用Scanner类定义对象
        System.out.println("please input a integer number");

        int num=in.nextInt(); //接收整形数据

        int s = NumberOf1(num);

        System.out.println(s);

    }
    public static int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while (n != 0 ) {
            count++;
            n = (n - 1) & n;
        }
        return count;
    }
}
