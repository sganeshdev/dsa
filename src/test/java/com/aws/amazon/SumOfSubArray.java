package com.aws.amazon;

import java.util.Arrays;

public class SumOfSubArray {
    void subArray(int arr[],int size,int sum){
        //System.out.println(Arrays.stream(arr).sum());
        for(int i=0;i<size;i++){
            int currentSum = arr[i];
            if(sum == currentSum){
                System.out.println("sum found at index..."+i);
                return;
            }else{
                for(int j=i+1;j<size;j++){
                    currentSum += arr[j];
                    if(sum ==currentSum){
                        System.out.println(
                                "Sum found between indexes " + i
                                        + " and " + j);
                        return;
                    }

                }
            }
        }
        System.out.println("No subarray found");
        return;
    }

    public static void main(String[] args) {
        SumOfSubArray sumOfSubArray = new SumOfSubArray();
        int arr[]={ 15, 2, 4, 8, 9, 5, 10, 23 };
        int size = arr.length;
        int sum = 23;
        sumOfSubArray.subArray(arr,size,sum);
    }
}
