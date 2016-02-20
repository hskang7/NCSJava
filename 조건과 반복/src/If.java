import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("성적 입력: ");
		int score = input.nextInt();
		input.close();

		if (90 <= score)
			System.out.println("성적이 좋습니다.");	

		System.out.println("시험 수고하셨습니다.");	
	}
	
}
