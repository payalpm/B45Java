package day5;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//accessing same package class
				Base b1 =new Base();  
				//object
				/*
				 * created a new object of the 
				 * "Base" class by using the "new" keyword and the constructor of the "Base" class.
				 */
				b1.methodDefault();
				b1.methodProtected();
				b1.methodPublic();
				/*
				 * called the "methodDefault()", "methodProtected()", 
				 * and "methodPublic()" methods of the "Base" class using the object of the "Base" class.
				 */
				
			b1.varDefault=11;
			b1.methodDefault();
			
			// private member accessing
			  /*b1.varPrivate=21;
			b1.mehtodPrivate(); */
			/*
			 * changed the value of the "varDefault" variable of the 
			 * "Base" class using the object of the "Base" class and called the "methodDefault()" method again.
			 */
			
			b1.varProtected=31;
			b1.methodProtected();
			
		    b1.varPublic=41;
		    b1.methodPublic();
		    
		    
		   // instance operator
		    System.out.println(b1 instanceof Base);   //true 
		    /*
		     * instanceof" operator to check whether the object of the 
		     * "Base" class is an instance of the "Base" class or not, and it returned "true
		     */
	}

}
