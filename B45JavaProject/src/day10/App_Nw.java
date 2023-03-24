package day10;

public class App_Nw
{
	void validate (int age)
	{
		if(age <18) {
		throw new ArithmeticException("cause their age is less");
		}
		else {
			System.out.println("they are eligible");
		}
	}

	public static void main(String[] args) {
		App_Nw obj= new App_Nw();
		obj.validate(19);
		

	}

}