public class StdIO {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("������ �Ǽ��� ���� �Է��ϼ���.");
		int i = input.nextInt();
		double d = input.nextDouble();
		System.out.println("i = " + i + ", d = " + d);		
		System.err.println("������ �����ϴ�.");
		input.close();
		
		int year = 2014;
		double amount = 1_000_000;
		System.out.format("%1$d %2$f %1$8d %2$f", year, amount);
		System.out.println();

		byte age = 27;
		int weight = 70;
		double height = 175.8;		
		System.out.printf("����: %d, ������: %d, Ű: %f, ", age, weight, height);
		System.out.printf("%s: %c ��", "������", 'O');
		
	}
}