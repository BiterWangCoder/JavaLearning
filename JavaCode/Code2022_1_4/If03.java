

//��ʾ���֧����
import java.util.Scanner;

public class If03{

	public static void main(String[] args){

		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("������֥�����÷�:");

		int creditScore = myScanner.nextInt();

		if (creditScore <= 100)
		if (creditScore == 100)
			System.out.println("���ü���!");
		else if (creditScore > 80 && creditScore <= 90)
			System.out.println("��������!");
		else if (creditScore >= 60 && creditScore <= 80)
			System.out.println("����һ��!");
		else
			System.out.println("���ò�����!");
		else
			System.out.println("�������");
	}

}