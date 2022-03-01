package project0;

public class ScopeTest {
	static int dummy=1;
		
	public static void main(String[] args) {
		
		for(int dummy=1;dummy<5;dummy++)
		{
			System.out.println(dummy);
		}
		System.out.println(dummy);
		
	}

}
