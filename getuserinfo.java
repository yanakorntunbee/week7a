package week7b;
import java.util.Scanner;
public class getuserinfo{
	public static void main(String[]args) {
		String name;
		int age;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Enter your name >>");
		name = inputDevice.nextLine();
		System.out.print("Enter your name >>");
		age = inputDevice.nextInt();
		System.out.println("Your name "+name+" Your age" +age);
		
		
	}
	
	
}