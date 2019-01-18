package javapractice.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreateObject implements Cloneable{

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
		try {
			Class clz = Class.forName("javapractice.example.CreateObject");
			CreateObject c3 = (CreateObject) clz.newInstance();
			c3.printMsg("using new instance");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Constructor<CreateObject> constructor = CreateObject.class.getConstructor();
			CreateObject c4 = constructor.newInstance();
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	
}
