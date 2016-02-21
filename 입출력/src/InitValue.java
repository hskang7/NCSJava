public class InitValue {
	
	//필드 선언 
	static int def;		//현재 static을 빼면 문법오류 발생
	static boolean bool;//현재 static을 빼면 문법오류 발생
	static String str;	//현재 static을 빼면 문법오류 발생
	static String name = "Java";

	public static void main(String[] args) {
		//지역변수 선언
		int n = 100;
		System.out.println(n);
		int year = 1995;
		System.out.format("%s는 %d년도에 개발되었다.", name, year);
		System.out.println();
		
		//필드 사용 가능
		System.out.println(def);	
		System.out.println(bool);	
		System.out.println(str);
		
	}
	
}