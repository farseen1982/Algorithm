
public class CountingSort {

	public CountingSort() {
		// TODO Auto-generated constructor stub
	}
	public static int[] sort(int[] a) {
		return counting(a);
		
	}
	
	public static int[] counting(int[] a) {
//find max K
		int[] result =  new int[a.length];
		int k = 0;
		for (int i = 0; i< a.length; i++ ) {
			if ( a[i] >= k ) k = a[i];
		}
		System.out.println();
		int[] c = new int[k+1];
//init value for c[i]		
		for (int i = 0; i < a.length; i ++) {
			c[a[i]]++;
		}
//calculate c[i]
		for (int i = 0; i < k; i++) {
			c[i+1] = c[i] +c[i+1];
		}
		System.out.println("\nArray C after initial:\n");
		AlgoUtil.printArray(c);
//put result
		for (int i = a.length-1; i>=0; i-- ){
			result[c[a[i]]-1] = a[i];
			c[a[i]]--;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] a = AlgoUtil.covert2int(args);
		AlgoUtil.printArray(a);
		int result[] = CountingSort.sort(a);
		AlgoUtil.printArray(result);
	}

}
