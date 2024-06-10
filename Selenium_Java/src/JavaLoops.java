import org.testng.annotations.Test;

public class JavaLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) {
			int k = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(k);
				System.out.print("\t");
				k++;

			}

			System.out.println("");

		}

	}

	@Test
	public void iteration() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
		}
	}

	@Test
	public void enhancedFor() {
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int number : numbers) {
			System.out.println(number);
		}
	}

	@Test
	public void breakStatement() {
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				break; // exit the loop when i is 5
			}
			System.out.println(i);
		}

	}

	@Test
	public void continueStatement() {
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue; // exit the loop when i is 5
			}
			System.out.println(i);
		}

	}
	
	@Test
	public void matrix()
	{
		int[][] matrix = {
			    {10, 2, 3},
			    {4, 50, 6},
			    {7, 8, 90}
			};
		
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.println(matrix[i][j]);
		    }
		}

	}

}
