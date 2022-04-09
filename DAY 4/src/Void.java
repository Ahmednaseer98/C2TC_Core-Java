// Java program to see how can we call 
// an instance method without parameter
import java.io.*;
class GFG
{
	// static method
	public static void main (String[] args) {
		// Creating object of the class
		GFG obj = new GFG();
		// Calling instance method
		obj.disp();
		System.out.println("GFG!");
	}
	// Instance method
	void disp()
	{
		//Local variable
		int a=20;
		System.out.println(a);
	}
}