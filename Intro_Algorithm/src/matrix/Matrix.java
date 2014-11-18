package matrix;

public class Matrix {
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
