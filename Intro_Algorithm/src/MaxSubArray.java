import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {
	public static int[] findMaxSubArray(int[] array, int low, int high) {
		int[] result = new int[3];
		if (low == high) {
			result[0] = array[low];
			result[1] = low;
			result[2] = high;
			return result;
		} else {
			int mid = (low + high) / 2;
			int[] left = findMaxSubArray(array, low, mid);
			int[] right = findMaxSubArray(array, mid, high);
			int[] cross = findCrossSubArray(array, low, mid, high);
			if (left[0] >= right[0] && left[0] >= cross[0])
				return left;
			if (right[0] >= left[0] && right[0] >= cross[0])
				return right;
			return cross;
		}
	}

	public static int[] findCrossSubArray(int[] array, int low, int mid,
			int high) {
		int result[] = new int[3];
		int left = 0;
		int right = 0;
		int leftsum = 0;
		int rightsum = 0;
		int sum = 0;
		for (int i = low; i < mid; i++) {
			sum = sum + array[i];
			if (sum > leftsum) {
				leftsum = sum;
				left = i;
			}
		}
		for (int i = mid; i < high; i++) {
			sum = sum + array[i];
			if (sum > rightsum) {
				rightsum = sum;
				right = i;
			}
		}
		result[0] = leftsum + rightsum;
		result[1] = left;
		result[2] = right;
		return result;
	}

	public static void main(String[] args) {
		int[] inputs = AlgoUtil.covert2int(args);
		findMaxSubArray(inputs, 0, inputs.length - 1);
	}

}
