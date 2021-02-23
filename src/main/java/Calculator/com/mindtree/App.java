package Calculator.com.mindtree;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		int first, second, add, subtract, multiply;
		float devide;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Two Numbers : ");
		first = scanner.nextInt();
		second = scanner.nextInt();

		add = add(first,second);
		subtract = sub(first, second);
		multiply = mul(first , second);
		devide = div( first , second);

		System.out.println("Sum = " + add);
		System.out.println("Difference = " + subtract);
		System.out.println("Multiplication = " + multiply);
		System.out.println("Division = " + devide);
	}

	public static float div(int first, int second) {
		// TODO Auto-generated method stub
		return (float)first/second;
	}

	public static int mul(int first, int second) {
		// TODO Auto-generated method stub
		return first*second;
	}

	public static int sub(int first, int second) {
		// TODO Auto-generated method stub
		return first-second;
	}

	public static int add(int first, int second) {
		// TODO Auto-generated method stub
		return first+second;
	}
}
