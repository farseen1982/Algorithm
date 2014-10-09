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
		System.out.println("Delta: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "   ");
		}
	}
}
