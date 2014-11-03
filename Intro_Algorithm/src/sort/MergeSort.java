package sort;
public class MergeSort {
	public static int level = 0;

	public MergeSort() {
		// TODO Auto-generated constructor stub
	}

	public static void merge(int a[], int left, int mid, int right) {
		level++;
		System.out.println("\nEnter level: " + level);
		System.out.println("Sort from: " + left + "  to  " + right);

		int lcount = left;
		int rcount = mid + 1;
		int[] sorted = new int[right - left + 1];

		int index = 0;
		while (lcount <= mid || rcount <= right) {
			if (lcount > mid) {
				sorted[index] = a[rcount];
				rcount++;
			}else if (rcount > right) {
				sorted[index] = a[lcount];
				lcount++;
			}else if (a[lcount] > a[rcount]) {
				sorted[index] = a[rcount];
				rcount++;
			} else {
				sorted[index] = a[lcount];
				lcount++;
			}

			index++;

		}

		for (int i = 0; i < sorted.length; i++) {
			a[left + i] = sorted[i];
		}
		print(sorted);

	}

	public static void mergeSort(int[] array, int first, int last) {
		// Divide
		if (first < last) {
			int mid = (first + last) / 2;
			// Conquer
			mergeSort(array, first, mid);
			mergeSort(array, mid + 1, last);
			// Merge
			merge(array, first, mid, last);
		}

	}

	public static int[] init(String[] args) {
		int[] result = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + "   ");
			result[i] = Integer.parseInt(args[i]);
		}
		return result;
	}

	public static void print(int[] array) {
		System.out.println("\nSorted Array:  ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

	public static void main(String[] args) {
		int[] arrays = init(args);
		mergeSort(arrays, 0, arrays.length-1);
		print(arrays);

	}

}
