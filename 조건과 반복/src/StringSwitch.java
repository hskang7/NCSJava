import java.util.Scanner;

public class StringSwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� �̸��� �Է�: ");
		String nation = input.next();
		input.close();
		
		switch ( nation ) {
			case "�ѱ�" :
			case "�Ϻ�" :
			case "�߱�" :
				System.out.printf("%s��(��) �ƽþ��Դϴ�.\n", nation);
				break;

			case "��������ī" : case "����" : case "�����" :
				System.out.printf("%s��(��) ������ī�Դϴ�.\n", nation);
				break;

			case "�̱�" : case "�߽���" : case "�����" :
				System.out.printf("%s��(��) �Ƹ޸�ī�Դϴ�.\n", nation);
				break;

			case "������" : case "����" : case "����" : 
				System.out.printf("%s��(��) �����Դϴ�.\n", nation);
				break;

			default : 
				System.err.printf("���� �̸��� �߸� �Է��ϼ̽��ϴ�.\n");
		}
	}
}
