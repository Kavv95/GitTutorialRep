package pl.adi.git;

public class Main {

	public static void main(String[] args) {
		
		SalesData data = new SalesData();
		
		displayGreetings();
		data.display();
	}

	private static void displayGreetings() {
		
		System.out.println("Hello happy sales people");
		System.out.println("This is app that shows data");
		System.out.println("---------------------------");
		
		System.out.println("Test 1");
		System.out.println("Test 2");
	}

}
