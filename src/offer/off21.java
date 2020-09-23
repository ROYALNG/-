package offer;

import java.util.Scanner;

public class off21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int[] n = new int[s.length];
        for(int i=0;i<n.length;i++){
            n[i] = Integer.parseInt(s[i]);
        }
        reOrderArray(n);
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }

    }

    public static void reOrderArray(int[] nums){
        int N = nums.length;
        for(int i=N-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(isEven(nums[j]) && !isEven(nums[j+1]))
                    swap(nums,j,j+1);
            }
        }
    }

    public static boolean isEven(int x){
        return x%2 == 0;
    }

    private static void swap(int[] nums,int i,int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
