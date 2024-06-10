import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class testSample {

	@Test
	public static void testExcel() throws IOException {
		
		dataDriven d = new dataDriven();
		ArrayList<String> data =d.getData("Add Profile");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
		
	}

}
