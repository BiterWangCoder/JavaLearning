import java.util.Scanner;

public class SeqSearch {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		String[] array = {"���۰���", "��ëʨ��", "��üӥ��"};
		System.out.print("��������Ҫ���ҵ�����:>");
		String findName = myScanner.next();
		//�����ʶ��
		int index = -1;//�����鿴�Ƿ��ҵõ�
		int i = 0;
		for (i = 0; i < array.length; i++) {
			if (findName.equals(array[i])) {
				System.out.println("�ҵ���,�±�Ϊ" + i);
				index = 1;
				break;
			}
		}
		//��ʶ���Ƿ�ı�
		if (index == -1) {
			System.out.println("�Ҳ���");
		}
	}
}