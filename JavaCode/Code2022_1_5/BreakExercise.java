import java.util.Scanner;

public class BreakExercise {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		final String name = "����";
		final String key = "666";
		int i = 0;
		for (i = 0; i < 3; i++) {

			System.out.print("������ͬ����:>");
			String administrationName = myScanner.next();
			System.out.print("����������:>");
			String keyword = myScanner.next();
			//�Ƚ��ַ���
			//������equals
			if (name.equals(administrationName) && key.equals(keyword)){
				System.out.println("������ȷ");
				break;
			} 
			else{
				System.out.println("�����������������");
			}
		}
	}
}