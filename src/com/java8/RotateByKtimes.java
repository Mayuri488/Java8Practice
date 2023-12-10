package com.java8;

public class RotateByKtimes {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60,70};
        int k=2;
        rotateArr(arr,k);
    }

    private static void rotateArr(int[] arr, int k) {
        int[] newArr = new int[arr.length];
        int i=0;
        int end = ((arr.length-1)-k)+1;

        for (int startValue = k ; startValue<=arr.length-1; startValue++){
            newArr[i]=arr[startValue];
            i++;
        }

        for(int n = 0; n<k; n++){
            newArr[end] = arr[n];
            end++;
        }
    }


}
