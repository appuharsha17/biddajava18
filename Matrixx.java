package labtest;

public class Matrixx {
	
		void display(int x[][], int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println();
		 }
}
public static void main(String[] args) {
	int m = 3, n = 3;
	int [][]a = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	int [][]b = new int[][] {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
	int [][]sum = new int[m][n];
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++)
			sum[i][j] = a[i][j] + b[i][j];
		}
		Matrixx obj = new Matrixx();
		System.out.println("Fisrt matrix");
		obj.display(a, m, n);
		System.out.println("Second matrix");
		obj.display(b, m, n);
		System.out.println("Sum of two matrix:");
		obj.display(sum, m, n);
	}
}



