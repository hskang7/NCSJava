public class ForCel2Far3 {
	static int MAX = 3;
	static int INCREMENT = 10;
	
	public static void main(String[] args) {
		double celcius = 12.46;

		System.out.printf("  ¼·¾¾(C)  È­¾¾(F)\n");
		System.out.printf("--------------------\n");

		for (int i = 1; i <= MAX; i++, celcius += INCREMENT) {
			System.out.printf("%8.2f %8.2f\n", celcius, 9.0 / 5 * celcius + 32);
		}	
	}
}
