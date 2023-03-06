package Day1;

public class type_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Type casting is when you assign a value of one primitive data type to another type.

			In Java, there are two types of casting:
			
			Widening Casting (automatically) - converting a smaller type to a larger type size
			byte -> short -> char -> int -> long -> float -> double
			
			Narrowing Casting (manually) - converting a larger type to a smaller size type
			double -> float -> long -> int -> char -> short -> byte
		 */
		byte b=10;
		int i=b;
		System.out.println(i);
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		char ch= 'A';
		int i3=ch;
		System.out.println(i3);
		
		char var1= '\u00A7';
		int i4= var1;
		System.out.println(i4);
		
		
		double f1 = 10.52f;
		long l = (long) f1;;
		System.out.println(l);
		
		long l1= 923372036854775806l;
		
		int i2= (int)l1;
		System.out.println(i2);
		
		float f2=32.56f;
		int i1=(int) f2;
		System.out.println(i1);
		
		byte b1=90;
		char ch1=(char)b1;
		System.out.println(ch1);
		
		
		

	}

}
