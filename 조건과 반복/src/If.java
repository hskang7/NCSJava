import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("���� �Է�: ");
		int score = input.nextInt();
		input.close();

		if (90 <= score)
			System.out.println("������ �����ϴ�.");	

		System.out.println("���� �����ϼ̽��ϴ�.");	
	}
	
}
