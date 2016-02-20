import java.util.Scanner;

public class Scoreifelse {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("성적 입력: ");
		int score = input.nextInt();
		input.close();
		
		if (60 <= score)
			System.out.println("합격입니다.");
		else 
			System.out.println("불합격입니다.");
	}
	
}
