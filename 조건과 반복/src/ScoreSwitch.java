import java.util.Scanner;

public class ScoreSwitch {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("���� �Է�: ");
		int score = input.nextInt();
		input.close();

		switch (score / 10) {
		case 10: case 9:
			System.out.printf("������ %d ������ ������ %c �Դϴ�.\n", score, 'A');
			break;
		case 8:
			System.out.printf("������ %d ������ ������ %c �Դϴ�.\n", score, 'B');
			break;
		case 7:
			System.out.printf("������ %d ������ ������ %c �Դϴ�.\n", score, 'C');
			break;
		case 6:
			System.out.printf("������ %d ������ ������ %c �Դϴ�.\n", score, 'D');
			break;

		default:
			System.out.printf("������ %d ������ ������ %c �Դϴ�.\n", score, 'F');
		}
	}
}
