
import java.util.Scanner;

public class If02{

	public static void main(String[] args){

		//�жϳ����ɼ�
		Scanner myScanner = new Scanner(System.in);
		double score = myScanner.nextDouble();
		char sex = myScanner.next().charAt(0);//�����ַ�

		//�ж��Ա�
		if (sex == '��'){
			if (score > 8.0){
				System.out.println("��ϲ����������");
			}
			else{
				System.out.println("ʧ�ܣ�");
			}
		}
		else{
			if (score > 8.0){
				System.out.println("��ϲ��������!");
			}
			else{
				System.out.println("ʧ�ܣ�");
			}
		}
	}
}
