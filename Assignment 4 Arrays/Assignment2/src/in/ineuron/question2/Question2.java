package in.ineuron.question2;

import java.util.*;
import java.util.stream.Collectors;
public class Question2 {
	public static List<List<Integer>> difference(int[] nums1, int[] nums2) {
	    Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
	    Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
	    Arrays.stream(nums1).forEach(set2::remove);
	    Arrays.stream(nums2).forEach(set1::remove);
	    return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));
	  }
	public static void main(String[] args) {
		int nums1[] = {1,2,3};
		int nums2[] = {2,4,6};
		System.out.println(" The Common elements are ");
		System.out.println(difference(nums1, nums2));

	}

}
