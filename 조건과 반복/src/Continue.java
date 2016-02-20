public class Continue {
	static final int MAX = 10;
	
	public static void main(String[] args) {
		int i = 1;
		
		System.out.printf("1에서 %d까지 정수 중에서 3으로 나누어 떨어지지 않는 수\n", MAX);
		for (i = 1; i <= MAX; i++) {
			if (i%3 == 0) continue;
			System.out.print(i + " ");
		}
		
		System.out.println();
	}
}
