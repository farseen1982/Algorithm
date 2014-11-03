package sort;
/**
 * 
 */

/**
 * @author I042117
 * 
 */
public class QuickSort {

	/**
	 * 
	 */
	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	public static int[] sort(int[] a) {
		quickSort(a, 0, a.length - 1);
		return a;
	}

	public static void quickSort(int[] a, int left, int right) {
		if (left < right) {
			int mid = partition(a, left, right);
			quickSort(a, left, mid-1);
			quickSort(a, mid, right);
		}

	}

	public static int partition(int[] a, int left, int right) {
		System.out.println("\n***********Start Partition From: " + left
				+ "  To: " + right);
		AlgoUtil.printArray(a, left, right);
		int pivot = a[right];
		int temp;
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (a[j] < pivot) {
				i++;
				// exchange a[i], a[j]
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;

			}

		}
		temp = a[right];
		a[right] = a[i + 1];
		a[i + 1] = temp;
		System.out.println("\n************End Partition with Pivot index: "
				+ (i + 1));
		AlgoUtil.printArray(a, left, right);
		return i + 1;
	}

	public static void main(String[] args) {
		int[] a = AlgoUtil.covert2int(args);
		int[] result = QuickSort.sort(a);
		AlgoUtil.printArray(result);
	}

}
