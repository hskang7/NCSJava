import java.util.Scanner;

public class Scoreifelse {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("���� �Է�: ");
		int score = input.nextInt();
		input.close();
		
		if (60 <= score)
			System.out.println("�հ��Դϴ�.");
		else 
			System.out.println("���հ��Դϴ�.");
	}
	
}
