package in.ineuron.question8;

public class Question8 {
	public static int[] xy(int[] nums, int n) {
		int[] ans = new int[2 * n];
		int j = 0;
		for (int i = 0; i < 2 * n; i = i + 2) {
			ans[i] = nums[j];
			ans[i + 1] = nums[n + j];
			j++;
		}
		return ans;
	}

	public static void main(String[] args) {
		int n = 3;
		int[] nums = { 2, 5, 1, 3, 4, 7 };

		for (int element : xy(nums, n)) {
			System.out.println(element);
		}

	}

}
