package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class no4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
       List<List<Integer>> list2 = threeSum(arr);
       System.out.println(list2.toString());
    }

    public static List<List<Integer>> threeSum(int[] nums){
        //先排好序
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }

        List<List<Integer>> list=new ArrayList<>();

        int i=0;
        //先固定第一个数，然后根据三个数的和大于还是小于0移动后两个数
        //下面出现的所有continue都是为了去重
        while(i<nums.length){

            if(nums[i]>0)
                return list;
            if(i>0&&nums[i-1]==nums[i]){
                i++;
                continue;
            }

            //第二个数在头部，第三个数在尾部
            for(int j=i+1,k=nums.length-1;j<k;){
                if(j>i+1&&nums[j-1]==nums[j]){
                    j++;
                    continue;
                }
                if(k<nums.length-1&&nums[k]==nums[k+1]){
                    k--;
                    continue;
                }
                int temp=nums[i]+nums[j]+nums[k];
                if(temp>0)
                    k--;
                else if(temp<0)
                    j++;
                else{
                    List<Integer> list1=new ArrayList<>();
                    list1.add(nums[i]);
                    list1.add(nums[j]);
                    list1.add(nums[k]);
                    list.add(list1);
                    j++;
                    k--;
                }
            }
            i++;

        }
        return list;
    }
}
