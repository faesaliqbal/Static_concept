package package1;

public class Counter {
	
	/*
	 * When you declare a variable or a method as static, it belongs to the class, rather than to a specific instance.
	 * This means that only one instance of a static member exists, even if you create multiple objects of the class or even if you don't create any.
	 * This only one instance of a static member will be shared by all the objects.
	 */
	public static int COUNT = 0;
	/*
	 * Its a common practice to use upper case when naming a static variable, although not mandatory.
	 * COUNT variable will be shared by all objects of that class.
	 */
	
	//constructor
	Counter(){
		COUNT++;
	}
	
	/*
	 * same concept applies to static methods.
	 */
	public static void horn(){
		System.out.println("beep");
	}


}
