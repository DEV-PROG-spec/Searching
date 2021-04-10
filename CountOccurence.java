package Searching;

import java.util.Scanner;

public class LastOccurence {
    public static int lastOccurence(int arr[],int n,int start,int end){
        start = 0;
        end = arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(n<arr[mid]){
                end = mid-1;
            }
            else if(n>arr[mid]){
                start = mid+1;
            }
            else{
                if(arr[mid]==arr.length||arr[mid]!=arr[mid+1]){
                    return mid;
                }
                else{
                    start=mid+1;
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
        int index =lastOccurence(array,n,0,x);
        System.out.println(index);
    }

}
