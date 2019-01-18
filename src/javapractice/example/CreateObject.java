package javapractice.example;

public class CreateObject {

	public void printMsg(String message) {
		System.out.println(message);
	}
	public static void main(String[] args) {
		CreateObject c1 = new CreateObject();
		c1.printMsg("Hi");
		
	}
	
}
