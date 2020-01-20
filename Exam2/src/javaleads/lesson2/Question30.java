package javaleads.lesson2;
import java.util.Scanner;
public class Question30 {

	public static void main(String[] args) {
	
		
		try {
			
	    System.out.println("please enter two numbers");
		Scanner myscan= new Scanner(System.in);
		int a = myscan.nextInt();
		int b = myscan.nextInt();
        int result = a/b;
        System.out.println(result);
		}catch (ArithmeticException e) {
			System.out.println(e);	
		} 
	}

}
