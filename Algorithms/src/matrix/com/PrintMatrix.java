package matrix.com;

public class PrintMatrix {

	public static void main(String[] args) {
		int  row = 10;
		int col = 10;
		int matrix [][] = new int [row][col];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = j;
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
