import org.testng.annotations.Test;

public class ConditionalStatements {

	@Test
	public  void age() {
		
		int age =16;
		if(age>=18)
		{
			System.out.println("You are adult");
		}
		else
		{
			System.out.println("You are minor");
		}
	}
	
	@Test
	public void grade()
	{
		int marks = 70;
		if (marks >= 90) {
		    System.out.println("Grade A");
		} else if (marks >= 80) {
		    System.out.println("Grade B");
		} else if (marks >= 70) {
		    System.out.println("Grade C");
		} else {
		    System.out.println("Grade D");
		}
	}
	
	@Test
	public void condition()
	{
		int a = 9;
		int b = 9;
		if (a>b) {
			System.out.println("a is bigger");
			}
		else if (a==b)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("b is bigger");
		}
	}
	
	@Test
	public void switchDay()
	{
	int day = 3;
	switch (day) {
	    case 1:
	        System.out.println("Monday");
	        break;
	    case 2:
	        System.out.println("Tuesday");
	        break;
	    case 3:
	        System.out.println("Wednesday");
	        break;
	    // other cases
	    default:
	        System.out.println("Invalid day");
	}

	}
	
	

}
