import datastructure.TreeNode;

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
		System.out.println("Array from: " + left + "  to: " + right);
		for (int i = left; i <= right; i++) {
			System.out.print(array[i] + "   ");
		}

	}

	public static TreeNode buildTreeNode(String[] array) {
		TreeNode[] nodes = new TreeNode[array.length];
		nodes[0] = new TreeNode();
		nodes[0].key = array[0];
		nodes[0].id = 0;
		for (int i = 1; i < array.length; i++) {
			nodes[i] = new TreeNode();
			nodes[i].id = i;
			nodes[i].key = array[i];
			nodes[i].parent = nodes[(i + 1) / 2 - 1];
			if (nodes[i].id % 2 == 0) {
				nodes[i].parent.right = nodes[i];
			} else {
				nodes[i].parent.left = nodes[i];
			}
		}
		return nodes[0];
	}
}
