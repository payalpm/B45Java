package day5;

public class Base {
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;

	//Declaring method for default, public, pvt , protected
	void methodDefault() {
		System.out.println("Default access Base class");
		System.out.println("Default Variable : "+ varDefault);
	}
	/*
	 * This method has a default access modifier, which means it can only be 
	 * accessed within the same package. It prints a message and the value 
	 * of the varDefault variable.
	 */
public void methodPublic() {
	System.out.println("Public access Base class");
	System.out.println("Public Variable: "+ varPublic);
}
/*
 * This method has a public access modifier, which means it can 
 * be accessed from anywhere. It prints a message and the value of the varPublic variable.
 */
private void methodPrivate() {
	System.out.println("Private access Base class");
	System.out.println("Private Variable : "+varPrivate);
}
/*
 * This method has a private access modifier, which means it can only be 
 * 	accessed within the same class. It prints a message and the value of the varPrivate variable.
 */
protected void methodProtected() {
	System.out.println("Protected access Base class");
	System.out.println("Protected Variable :"+ varProtected);

}
/*
 * This method has a protected access modifier, which means it can only be accessed within the 
 * same class or subclasses. It prints a message and the value of the varProtected variable.
 */
}
