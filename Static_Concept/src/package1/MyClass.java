package package1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter c1 = new Counter(); //constructor is called and this will set the COUNT value to 1. This value is visible for all the objects because it is static.
		Counter c2 = new Counter(); //constructor is called and this will set the COUNT value to 2. Now this value is visible for all the objects because it is static.
		
		System.out.println(Counter.COUNT); //output will be 2
		
		/*
		 * You can also access the static variable using any object of that class.
		 */
		System.out.println(c1.COUNT); //output will be 2
		System.out.println(c2.COUNT); //output will be 2
		
		Counter.horn(); //static method has been accessed through class name.
		
		

	}

}
