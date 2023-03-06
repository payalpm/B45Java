package day3;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=4;
		switch(x)
		{
		case 'l': 
		case 'L':
			System.out.println(x+ " is a letter");
			break;
		case 'd':
		case 'D':
			System.out.println(x+ " is a digit");
			break;
			
		case 'w':
		case 'W':
			System.out.println(x+ " is a white space");
		case 's':
		case 'S':
			System.out.println(x+ " is special letter");
			default:
				System.out.println(x+ " is other than letter");
				break;
		}
	}

}
