
import java.util.Scanner;

public class If01{
	public static void main(String[] args){
		//�ж�һ������Ƿ�Ϊ����
		//1. �ܱ�4���������ܱ�100����
		//2. �ܱ�400����
		//����һ�����
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("���������:");

		int year = myScanner.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
			System.out.println(year + "�����꣡");
		}
		else{
			System.out.println(year + "�������꣡");
		}
	}
}