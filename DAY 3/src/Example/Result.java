package Example;

class Example
{
	public void display(String s)
{
		System.out.println(s);
		}
	public void display(int i){
		System.out.println(i);
	}
} 
class Result
{
	public static void main (String[] args) 
	{ 
 Example obj = new Example();
		obj.display("Codingninjas");
		obj.display(5);
	}
}
	
		