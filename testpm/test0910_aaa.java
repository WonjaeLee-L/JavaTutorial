package testpm;

import java.util.Scanner;

public class test0910_aaa {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] a = { 
				{ 12, 12, 12, 4 }, 
				{ 1, 1, 1, 4 }, 
				{ 1, 13, 13, 13 }, 
				{ 14, 17, 13, 19 }, 
				{ 14, 22, 13, 24 },
				{ 14, 14, 14, 4 } };
		int nNum = in.nextInt();
		in.nextLine();
		for (int i = nNum / 10; i <= nNum / 10; i++) {
			for (int j = nNum % 10; j < a[0].length; j++) {
				if (j <= 1) {
					if (a[i][j] == a[i][j + 1] && a[i][j] == a[i][j + 2]) {
						for (int k = i; k > 0; k--) {
							a[k][j] = a[k - 1][j];
							a[k][j + 1] = a[k - 1][j + 1];
							a[k][j + 2] = a[k - 1][j + 2];
						}
						a[0][j] = (int) (Math.random() * 100);
						a[0][j + 1] = (int) (Math.random() * 100);
						a[0][j + 2] = (int) (Math.random() * 100);
					}
				} else if (j >= 2) {
					if (a[i][j] == a[i][j - 1] && a[i][j] == a[i][j - 2]) {
						for (int k = i; k > 0; k--) {
							a[k][j] = a[k - 1][j];
							a[k][j - 1] = a[k - 1][j - 1];
							a[k][j - 2] = a[k - 1][j - 2];
						}
						a[0][j] = (int) (Math.random() * 100);
						a[0][j - 1] = (int) (Math.random() * 100);
						a[0][j - 2] = (int) (Math.random() * 100);
					}
				} else if (j > 0 && j < 3) {
					if (a[i][j] == a[i][j - 1] && a[i][j] == a[i][j + 1]) {
						for (int k = i; k >= 0; k--) {
							a[k][j] = a[k - 1][j];
							a[k][j + 1] = a[k - 1][j + 1];
							a[k][j - 1] = a[k - 1][j - 1];
						}
						a[0][j] = (int) (Math.random() * 100);
						a[0][j + 1] = (int) (Math.random() * 100);
						a[0][j - 1] = (int) (Math.random() * 100);
					}
				}
			}
		}
		for (int w = 0; w < a.length; w++) {
			for (int q = 0; q < a[0].length; q++) {
				System.out.print(a[w][q] + " ");
			}
			System.out.println();
		}

	}

}
