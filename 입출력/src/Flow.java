public class Flow {
	
	// 필드 선언
	static String fd = " -- 필드";
	static String md = " -- 메소드";

	// 자바 프로그램을 실행하는 main() 메소드 구현
	public static void main(String[] args) {
		System.out.println("자바 클래스의 구조");
		write(fd);
		write(md);
		myPrint();
	}

	// 프로그래머가 정의하는 메소드 write()의 구현
	public static void write(String word) {
		System.out.println(word);
	}

	public static void myPrint() {
		System.out.format("%c%n", '\uac00');
		System.out.format("%c%n", '\127');
		System.out.format("%d%n", 30);
		System.out.format("%f%n", 3.4e3);
		System.out.format("%b%n", true);
	}
	
}