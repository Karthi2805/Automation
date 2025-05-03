package basics;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		/*
		 To write or retrieve the value from the web table
		 Variable.length is always return the size of row.
		 */
		int a[][] = {{10,20,30}, {40,50,60}, {70,80,90}};
		
		System.out.println(a[0][2]);
		System.out.println("******************************************");
		
		for (int i=0; i<a.length;i++) {
			for (int j=0; j<a.length;j++) {
				System.out.println(a[i][j]);
			}
		}

	}

}
