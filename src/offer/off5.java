package offer;

import java.util.Scanner;

public class off5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuffer sb = new StringBuffer(s);
        System.out.println(replaceSpace(sb));
    }

    public static String replaceSpace(StringBuffer str){
        int p1 = str.length() - 1;
        for(int i=0;i<=p1;i++){
            if(str.charAt(i)==' ')
                str.append("  ");
        }
        int p2 = str.length() - 1;
        while(p1>=0 && p2>p1){
            char c = str.charAt(p1--);
            if(c == ' '){
                str.setCharAt(p2--,'0');
                str.setCharAt(p2--,'2');
                str.setCharAt(p2--,'%');
            }else{
                str.setCharAt(p2--,c);
            }
        }
        return str.toString();
    }
}
