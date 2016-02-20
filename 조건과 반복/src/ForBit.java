public class ForBit {
	static final int TOTAL_BIT = 32;
	
	public static void main(String[] args) {
		
		int num = 13;
		System.out.printf("정수 %d의 %d비트 내부 값:\n", num, TOTAL_BIT);

		for (int i = TOTAL_BIT-1; i >= 0; i--)
			System.out.printf("%d", num >> i & 1);
		
		System.out.printf("\n");
		
		System.out.println(Integer.toBinaryString(num));
		
	}
}
