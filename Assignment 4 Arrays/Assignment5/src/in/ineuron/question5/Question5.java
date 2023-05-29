package in.ineuron.question5;

import java.util.Scanner;

public class Question5 {
	   public static int arrangeCoins(int n) {
	        if(n<0) return -1;
	        if(n==0) return 0;
	        int rows = 0;
	        long sum = 0;
	        while(sum<=n){
	            sum += rows+1;
	            rows++;
	        }
	        return rows-1;
	    }
	   public static void main(String[] args) {
			int n = 5;
	        System.out.println(arrangeCoins(n));

		}

}
