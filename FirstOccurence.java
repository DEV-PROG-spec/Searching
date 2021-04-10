package Searching;

import java.util.Scanner;

public class FirstOccurence {
    public static int firstOccurence(int[] arr,int n){
        int start = 0;
        int end = arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(n>arr[mid]){
                for(int j=mid+1;j<=arr.length;j++){
                    if(n==arr[j]){
                        return j;
                    }
                }
            }
            else{
                for(int k = 0;k<=mid-1;k++){
                    if(n==arr[k]){
                        return k ;
                    }
                }
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int x = sc.nextInt();
        int[] array = new int[x];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i<x;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the number you want to search");
        int n = sc.nextInt();
        int index = firstOccurence(array,n);
        System.out.println(index);
    }
}
