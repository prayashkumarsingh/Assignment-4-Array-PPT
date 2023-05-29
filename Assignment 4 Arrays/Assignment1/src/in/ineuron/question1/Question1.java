package in.ineuron.question1;

import java.util.Arrays;

public class Question1 {
	public static boolean binary_search(int arr[], int n, int element) {
		int l = 0, h = n - 1;
		while (l <= h) {
			int mid = (l + h) / 2;
			if (arr[mid] == element) {
				return true;
			} else if (arr[mid] > element) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return false;
	}

	public static void common(int a[], int b[], int c[], int n1, int n2, int n3) {

		for (int j = 0; j < n1; j++) {
			if (j != 0 && a[j] == a[j - 1]) {
				continue;
			}
			if (binary_search(b, n2, a[j]) && binary_search(c, n3, a[j])) {

				System.out.print(a[j] + " ");

			}
		}
	}

	public static void main(String[] args) {
		int ar1[] = {1,2,3,4,5};
		int ar2[] = {1,2,5,7,9};
		int ar3[] = {1,3,4,5,8};
		int n1 = ar1.length;
		int n2 = ar2.length;
		int n3 = ar3.length;
		System.out.println(" The Common elements are ");
		common(ar1, ar2, ar3, n1, n2, n3);

	}

}
