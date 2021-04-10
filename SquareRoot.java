package Searching;

import java.util.Scanner;

public class SquareRoot {
    public static int squareRoot(int x){
        int start = 1;
        int end = x;
        int ans = -1;
        while(start<=end){
            int mid = (start+end)/2;
            int msq = mid*mid;
            if(msq==x){
                return mid;
            }
            else if(msq>x){
                end= mid-1;
            }
            else{
                start = mid+1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(squareRoot(x));
    }
}
