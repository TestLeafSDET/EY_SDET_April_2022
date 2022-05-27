package datastrucutresAndAlgorithms.ey.training.week8.Day37;

public class FindNumberInCircularSortedArray {
	public static int searchCircularArray(int[] nums, int target){
		int left = 0;
		int right = nums.length - 1;

		while (left <= right){

			int mid = (left + right) / 2;

			if (target == nums[mid]) return mid;

			if (nums[mid] <= nums[right]){
				if (target > nums[mid] && target <= nums[right]) left = mid + 1;
				else right = mid - 1;
			}
			else {
				if (target >= nums[left] && target < nums[mid]) right = mid - 1;
				else left = mid + 1;        
			}
		}
		return -1;
	}
}
