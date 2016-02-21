public class StdIO {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("정수와 실수를 각각 입력하세요.");
		int i = input.nextInt();
		double d = input.nextDouble();
		System.out.println("i = " + i + ", d = " + d);		
		System.err.println("에러는 없습니다.");
		input.close();
		
		int year = 2014;
		double amount = 1_000_000;
		System.out.format("%1$d %2$f %1$8d %2$f", year, amount);
		System.out.println();

		byte age = 27;
		int weight = 70;
		double height = 175.8;		
		System.out.printf("나이: %d, 몸무게: %d, 키: %f, ", age, weight, height);
		System.out.printf("%s: %c 형", "혈액형", 'O');
		
	}
}