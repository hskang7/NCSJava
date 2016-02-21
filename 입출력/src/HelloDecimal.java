import java.util.Scanner;

public class HelloDecimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("십진수와 이진수를 각각 입력하세요.");
		int num1 = input.nextInt();
		int num2 = input.nextInt(2);
		
		System.out.println("팔진수와 16진수를 각각 입력하세요.");
		int num8 = input.nextInt(8);
		int num16 = input.nextInt(16);
		input.close();
		
		System.out.println("num1 = " + num1 + ", num2 = " + num2);		
		System.out.printf("num1 = %d, num2 = %d", num1, num2);	
		System.out.println();
		
		System.out.println("num8 = " + num8 + ", num16 = " + num16);		
		System.out.printf("num8 = %d, num16 = %d", num8, num16);	
	}

}
