public class InitValue {
	
	//�ʵ� ���� 
	static int def;		//���� static�� ���� �������� �߻�
	static boolean bool;//���� static�� ���� �������� �߻�
	static String str;	//���� static�� ���� �������� �߻�
	static String name = "Java";

	public static void main(String[] args) {
		//�������� ����
		int n = 100;
		System.out.println(n);
		int year = 1995;
		System.out.format("%s�� %d�⵵�� ���ߵǾ���.", name, year);
		System.out.println();
		
		//�ʵ� ��� ����
		System.out.println(def);	
		System.out.println(bool);	
		System.out.println(str);
		
	}
	
}