package select;

import datastructure.AlgoUtil;
import sort.QuickSort;

public class RandomSelect {
	public static int randomSelect(int[] a, int p, int r, int i) {
		if (p == r) {
			return p;
		}
		int q = QuickSort.partition(a, p, r);
		System.out.println("\n**********Select from: " + p + "  to: " + r
				+ "**********");
		System.out.println("\n**********Find index is: " + i);
		System.out.println("\n**********Pivot is at: " + q + "**********");
		int k = q - p + 1;
		System.out.println("\n**********Pivot is at sequence: " + k);
		if (i == k) {
			return q;
		} else if (i < k) {
			return randomSelect(a, p, q - 1, i);
		} else {
			return randomSelect(a, q, r, i - k);
		}

	}

	public static int randomPartition(int[] a, int p, int r) {
		int i = p;
		int j = r + 1;
		int x = a[p];
		while (i < j) {
			while (a[++i] < x && i <= r)
				;
			while (a[--j] > x && j >= p)
				;
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		a[p] = a[j];
		a[j] = x;
		return j;
	}

	public static void main(String[] args) {
		AlgoUtil.printArray(args);
		int[] input = AlgoUtil.covert2int(args);
		int result = randomSelect(input, 0, input.length - 2, input[input.length-1]);
		System.out.println("The output is at postion: " + result
				+ "  with value " + input[result]);
	}

}
