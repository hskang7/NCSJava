public class Basic2Switch {
	
	public static void main(String[] args) {
		int n = 5;
		switch (n % 2) {
		default:
			System.out.printf("¸ð¸§\n");
			break;
		case 0:
			System.out.printf("Â¦¼ö\n");
			break;
		case 1:
			System.out.printf("È¦¼ö\n");
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
