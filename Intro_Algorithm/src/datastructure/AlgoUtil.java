package datastructure;


public class AlgoUtil {
	public static int[] covert2int(String[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = Integer.parseInt(array[i]);
		}
		return result;

	}
	public static void printArray(String[] array) {
		System.out.println("Input: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}
	}
	
	public static void printArray(int[] array) {
		System.out.println("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}
	}
	public static void printArray(int[] array, int left, int right) {
		System.out.println("Array from: "+ left + "  to: "+ right);
		for (int i = left; i <= right; i++) {
			System.out.print(array[i] + "   ");
		}
		
	}
	
	public static int[][] createMatrix(int max, int row, int column){
		int[][] m = null;
		for(int i =0; i < row; i++) {
			for (int j=0; j< column; j++) {
				m[i][j] = (int) (Math.random()*max);
			}
		}
		return m;
	}
	
	public static void printMatrix(int[][] m){
		System.out.println("\nPrint Matrix of m[][]");
		for (int i = 0; i < m.length; i++) {
			for( int j= 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + "   ");
			}
			System.out.print("\n");
		}
	}
}
