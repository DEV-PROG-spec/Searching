package Searching;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static int binarysearch(int[] array,int n,int start ,int end){
       if(start>end){
           return -1;
       }
       int mid = (start+end)/2;
       if(n==array[mid]){
           return mid;
       }
       else if(n>array[mid]){
           return binarysearch(array,n,mid+1,end);
       }
       else{
           return binarysearch(array,n,start,mid-1);
       }


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
        int index = binarysearch(input,element,0,length);
        System.out.println(index);
    }
}
