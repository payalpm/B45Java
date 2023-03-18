package day9;

public class Variable {
	
	int s=45;  // instance variable
	
	static int g=25;  // static variable

	public static void main(String[] args) {
		int r= 23;     // Local variable
		
		System.out.println(r);
		
		System.out.println(g);
		Variable obj = new Variable();
		System.out.println(obj.s);
		
		
		
		
		
		
		

	}

}