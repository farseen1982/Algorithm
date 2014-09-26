import java.util.Arrays;

public class EX_4_1_3 {

	private static void getLargest(String[] args) {
		int delta = 0;
		int buyindex = 0;
		int amount = 0;
		int sellindex = 0;
		int[] figures = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + "   ");
		}
		for (int i = 0; i < figures.length; i++) {
			figures[i] = Integer.parseInt(args[i]);
			for (int j = i + 1; j < figures.length; j++) {
				figures[j] = Integer.parseInt(args[j]);
				if (figures[j] > figures[i]) {
					amount = figures[j] - figures[i];
				}
				if (amount > delta) {
					delta = amount;
					buyindex = i + 1;
					sellindex = j + 1;
				}
			}
		}
		System.out.println("\nMax Profit: " + delta);
		System.out.println("Buy at: " + buyindex);
		System.out.println("Sell at: " + sellindex);
	}

	public static void main(String[] args) {

		getLargest(args);

	}

}
