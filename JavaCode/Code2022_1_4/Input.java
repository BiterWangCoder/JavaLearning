import java.util.Scanner;//��ʾ��java.util�е�Scanner�ർ��

public class Input{
	public static void main(String[] args){
		//��ʾ�����û�������
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		String name = myScanner.next();
		System.out.println("����������");
		int age = myScanner.nextInt();
		System.out.println("������нˮ");
		double sal = myScanner.nextDouble();

		System.out.println("�˵���Ϣ���£�");
		System.out.println("name = " + name + "\n" + "age = " + age + "\n" + "sal = " + sal);
	}
}