package core.java;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		System.out.print("***1D Array***"+"\n");
		System.out.print("By using FOR loop: ");
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.print("By using FOR-EACH loop: ");
		// Using for-each loop
		for (int i : ar) {
			System.out.print(i+" ");
		}
		System.out.print("\n\n"+"***2D Array***"+"\n");
		System.out.print("By using FOR loop: "+ "\n");
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.print("By using FOR-EACH loop: \n");
		int[][] jag = {{1,2},{3,4,5,},{6,7,8,9}};
		for(int[] row : jag) {
			for(int i: row) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}
	}

}
