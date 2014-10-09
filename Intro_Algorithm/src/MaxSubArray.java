public class MaxSubArray {
	public static int[] findMaxSubArray(int[] array, int low, int high) {
		int[] result = new int[3];
		System.out.println("Enter subarray from: " + low + "  to: " + high);
		if (low == high) {
			result[0] = array[low];
			result[1] = low;
			result[2] = high;
			System.out.println("Max profit: " + result[0]);
			return result;

		} else {
			int mid = (low + high) / 2;
			int[] left = findMaxSubArray(array, low, mid);
			int[] right = findMaxSubArray(array, mid + 1, high);
			int[] cross = findCrossSubArray(array, low, mid, high);
			if (left[0] >= right[0] && left[0] >= cross[0]) {
				System.out.println("After merge Max profit: " + left[0]
						+ "　　Start:　" + left[1] + " End: " + left[2]);
				return left;
			}
			if (right[0] >= left[0] && right[0] >= cross[0]) {
				System.out.println("After merge Max profit: " + right[0]
						+ "　　Start:　" + right[1] + " End: " + right[2]);
				return right;
			}
			System.out.println("After merge Max profit: " + cross[0]
					+ "　　Start:　" + cross[1] + " End: " + cross[2]);
			return cross;
		}
	}

	public static int[] findCrossSubArray(int[] array, int low, int mid,
			int high) {
		System.out.println("Now start with cross array from��" + low
				+ "  mid:  " + mid + " To: " + high);
		int result[] = new int[3];
		int left = 0;
		int right = 0;
		int leftsum = 0;
		int rightsum = 0;
		int sum = 0;
		for (int i = mid; i >= low; i--) {
			sum = sum + array[i];
			if (sum > leftsum) {
				leftsum = sum;
				left = i;
			}
		}
		sum = 0;
		for (int i = mid + 1; i <= high; i++) {
			sum = sum + array[i];
			if (sum > rightsum) {
				rightsum = sum;
				right = i;
			}
		}
		result[0] = leftsum + rightsum;
		result[1] = left;
		result[2] = right;
		System.out.println("Max profit: " + result[0] + "　　Start:　" + result[1]
				+ " End: " + result[2]);
		return result;
	}

	public static int[] getDelta(int[] array) {
		int[] result = new int[array.length - 1];
		for (int i = 0; i < array.length - 1; i++) {
			result[i] = array[i + 1] - array[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] init = AlgoUtil.covert2int(args);
		AlgoUtil.printArray(args);
		int[] inputs = getDelta(init);
		AlgoUtil.printArray(inputs);
		int[] result = findMaxSubArray(inputs, 0, inputs.length - 1);
		System.out.println("Max Proft: " + result[0]);
		System.out.println("Buy at: " + result[1]);
		System.out.println("Sell at: " + result[2]);

	}

}
