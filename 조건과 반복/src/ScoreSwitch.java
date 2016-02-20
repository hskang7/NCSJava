import java.util.Scanner;

public class ScoreSwitch {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("점수 입력: ");
		int score = input.nextInt();
		input.close();

		switch (score / 10) {
		case 10: case 9:
			System.out.printf("점수가 %d 점으로 성적이 %c 입니다.\n", score, 'A');
			break;
		case 8:
			System.out.printf("점수가 %d 점으로 성적이 %c 입니다.\n", score, 'B');
			break;
		case 7:
			System.out.printf("점수가 %d 점으로 성적이 %c 입니다.\n", score, 'C');
			break;
		case 6:
			System.out.printf("점수가 %d 점으로 성적이 %c 입니다.\n", score, 'D');
			break;

		default:
			System.out.printf("점수가 %d 점으로 성적이 %c 입니다.\n", score, 'F');
		}
	}
}
