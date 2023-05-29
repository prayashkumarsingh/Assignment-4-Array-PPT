package in.ineuron.question7;

public class Question7 {
	 public static int maxCount(int m, int n, int[][] ops) {
	        int minRow = m, minCol = n;
	        for (int[] op : ops) {
	            minRow = Math.min(op[0], minRow);
	            minCol = Math.min(op[1], minCol);
	        }
	        return minRow * minCol;
	    }
	 public static void main(String[] args) {
		 int m=3;
		 int n= 3;
		 int[][] oops = {{2,2},{3,3}};
		 System.out.println(maxCount( m, n,oops));

		}

}
