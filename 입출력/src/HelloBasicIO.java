public class HelloBasicIO {
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("�̸��� �й��� �Է��ϼ���.");
		String name = input.next();
		int num = input.nextInt();
		
		System.out.println("�������� �Է��ϼ���.");
		double pi = input.nextDouble();
		
		input.close();
		
		System.out.print("�̸�: " + name);		
		System.out.println(" �й�: " + num);		
		System.out.println("������: " + pi);		
	}
	
}
