public class Continue {
	static final int MAX = 10;
	
	public static void main(String[] args) {
		int i = 1;
		
		System.out.printf("1���� %d���� ���� �߿��� 3���� ������ �������� �ʴ� ��\n", MAX);
		for (i = 1; i <= MAX; i++) {
			if (i%3 == 0) continue;
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
}
