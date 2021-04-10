package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static int binarysearch(int[] array,int n){
        int start = 0 ;
        int end = array.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(n==array[mid]){
                return mid;
            }
            else if(n>array[mid]){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int length = sc.nextInt();
        int[] input = new int[length];
        System.out.println("Enter the elements in array");
        for(int i=0;i<length;i++){
            input[i]=sc.nextInt();
        }
        System.out.println("Enter the element you want to search in array");
        int element = sc.nextInt();
        int index = binarysearch(input,element);
        System.out.println(index);
    }
}
