public class Flow {
	
	// �ʵ� ����
	static String fd = " -- �ʵ�";
	static String md = " -- �޼ҵ�";

	// �ڹ� ���α׷��� �����ϴ� main() �޼ҵ� ����
	public static void main(String[] args) {
		System.out.println("�ڹ� Ŭ������ ����");
		write(fd);
		write(md);
		myPrint();
	}

	// ���α׷��Ӱ� �����ϴ� �޼ҵ� write()�� ����
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