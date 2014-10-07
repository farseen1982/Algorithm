public class AlgoUtil {
	public static int[] covert2int(String[] array) {
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = Integer.parseInt(array[i]);
		}
		return result;

	}
	public static void printArray(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array + "   ");
		}
	}
}
