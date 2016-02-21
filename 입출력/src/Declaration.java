public class Declaration {
	
	public static void main(String[] args) {
		//지역변수 선언 
		String str = "문장과 주석";
		System.out.println(str);
		
		int year = 1995;	
		System.out.println("자바는 " +  year + "년도에 개발되었다.");
		
		double dollar = 1190.45;
		System.out.println("환전 : " + 500 * dollar);
		
		//변수 x는 사용하지 않으므로 경고 발생
		int x, y = 10, z = 20;			//int 형의 여러 변수 선언
		
		x = 300;
		System.out.println(x);	
		System.out.println(y);		
		System.out.println(z);				
	}
	
}