package corejava;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 123456789, reversedinteger = 0, remainder;
		while(num != 0)
		{
			remainder = num % 10;
			reversedinteger = reversedinteger * 10 + remainder;
			num = num/10;
		}
		
		System.out.println(reversedinteger);

	}

}
