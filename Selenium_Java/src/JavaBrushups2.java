import java.util.ArrayList;

public class JavaBrushups2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < b.length; i++) {
			if (b[i] % 2 == 0) {
				System.out.println(b[i]);
				break;
			} else {
				System.out.println(b[i] + "is not multiple of 2");
			}
		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Krishna");
		a.add("Prasad");
		a.add("Naidu");
		a.add("Selenium");
		System.out.println(a);
		System.out.println(a.get(2));
		a.remove(1);
		System.out.println(a);

	}

}
