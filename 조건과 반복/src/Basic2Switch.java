public class Basic2Switch {
	
	public static void main(String[] args) {
		int n = 5;
		switch (n % 2) {
		default:
			System.out.printf("��\n");
			break;
		case 0:
			System.out.printf("¦��\n");
			break;
		case 1:
			System.out.printf("Ȧ��\n");
			break;
		}

		int m = 1;
		switch (m) {
		case 0:
			System.out.printf("1\n");
		case 1:
			System.out.printf("2\n");
		default:
			System.out.printf("3\n");
		}
	}
	
}
