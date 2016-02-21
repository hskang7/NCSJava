public class Literals {
	
	static long creditCardNumber = 1234_5678_9012_3456L;
	static long socialSecurityNumber = 999_99_9999L;
	static float pi = 	3.14_15F;
	
	public static void main(String[] args) {
		//이진수
		System.out.println(Integer.toBinaryString(83));
		//16진수
		System.out.println(Integer.toHexString(63));
		System.out.println(0b1010);		//이진수
		System.out.println(016);		//8진수
		System.out.println(0x1F);		//16진수
		System.out.println(3.14f);		//float 형
		System.out.println(3.1415D);	//double 형
		System.out.println('\uAC00');	//유니코드
		System.out.println(creditCardNumber);
		System.out.println(socialSecurityNumber);
		System.out.println(pi);
	}
	
}