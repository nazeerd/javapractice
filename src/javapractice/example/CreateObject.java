package javapractice.example;

public class CreateObject {

	public void printMsg(String message) {
		System.out.println(message);
	}
	public static void main(String[] args) {
		CreateObject c1 = new CreateObject();
		c1.printMsg("Hi");
		try {
			CreateObject c2 = (CreateObject) c1.clone();
			c2.printMsg("Im cloning object");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
