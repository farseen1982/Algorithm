public class HeapSort {

	public HeapSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void BuildHeap(int[] a) {
// start with the half:
		int mid = a.length/2 - 1;
		MaxHeap(a, mid);
	}

	public static void MaxHeap(int[] a, int index) {
		int left = index*2+1;
		int right = left+1;
		int max  = 0;
// Get max index
		if ( a[index] >=  a[left] && a[index] >= a[right] ) {
			max = index;
		}else if ( a[left] >= a[right] && a[left] >= a[index] ) {
			max = left;
		}else{
			max = right;
		}
// max heap;
		if (max!=index ) {
		MaxHeap(a, max);
		}
	}

	public static void SortHeap(int[] a) {

	}

}
