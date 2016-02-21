public class HelloBasicIO {
	
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("이름과 학번을 입력하세요.");
		String name = input.next();
		int num = input.nextInt();
		
		System.out.println("원주율을 입력하세요.");
		double pi = input.nextDouble();
		
		input.close();
		
		System.out.print("이름: " + name);		
		System.out.println(" 학번: " + num);		
		System.out.println("원주율: " + pi);		
	}
	
}
