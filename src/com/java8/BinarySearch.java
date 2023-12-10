package com.java8;

public class BinarySearch {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int high = a.length-1;
        int low = 0;
        int mid;
        int search = 5  ;

        while (low <= high) {
            mid = low +(high-low)/2;
            if (a[mid] == search) {
                System.out.println("elemenet is found at location : "+ mid);
                break;
            } else
            {
                if(a[mid]<search){
                    low= mid+1;
                } else{
                    high=mid-1;
                }
            }


        }
    }
}
