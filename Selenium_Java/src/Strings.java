import org.testng.annotations.Test;

public class Strings {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("World");
		String str3 = str1 + " " + str2; // Concatenation
		System.out.println(str3); // Output: Hello World

	}
	
	@Test
	public void stringBuffer()
	{
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		sb.deleteCharAt(4);
		sb.append(" Good");
		System.out.println(sb); // Output: Hello World

	}

}
