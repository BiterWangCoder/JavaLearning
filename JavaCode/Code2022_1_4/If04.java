import java.util.Scanner;

public class If04{

	public static void main(String[] args){

		//ʵ�ֳ�Ʊϵͳ
		Scanner myScanner = new Scanner(System.in);

		System.out.println("�����뼾��:");
		char season = myScanner.next().charAt(0);
		System.out.println("�������������:");
		int age = myScanner.nextInt();
		//�ж������͵���
		if (season == '��'){
			if (age > 0){
				if (age > 60){
				System.out.println("Ʊ��Ϊ��20");
			}
			else if (age < 18){
				System.out.println("Ʊ��Ϊ��30");
			}
			else
				System.out.println("Ʊ��Ϊ��60");
			}
			else{
				System.out.println("������������");
			}
			
		}
		else if (season == '��'){
			if (age > 0){
				if (age>= 18 && age <= 60){
				System.out.println("Ʊ��Ϊ��40");
			}
			else{
				System.out.println("Ʊ��Ϊ��20");
			}
			}
			else{
				System.out.println("������������");
			}
		}
		else{
			System.out.println("�������");
		}
	}
}