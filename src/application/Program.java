package application;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Program {

	public static void main(String[] args) {
		
	}
	
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		
			try {
				String[] vect = sc.nextLine().split(" ");
				int position = sc.nextInt();
				System.out.println(vect[position]);
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Invalid Position!!!");
			}
			
			catch (InputMismatchException e) {
				System.out.println("Input Error!");
			}
		
		
		sc.close();
	}

}
