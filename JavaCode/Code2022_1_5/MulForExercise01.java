import java.util.Scanner;

public class MulForExercise01{

	public static void main(String[] args){

		//дһ���Լ���ɨ����
		Scanner myScanner = new Scanner(System.in);

		//�������
		double classOneScore = 0.0;
		double classTwoScore = 0.0;
		double classThreeScore = 0.0;
		double studentScore = 0.0;
		int i = 0;
		int j = 0;
		for (i = 0; i < 3; i++){
			System.out.println("������༶ͬѧ�ķ���:>");
			for (j = 0; j < 5; j++){
				System.out.println("������" + i + "�༶" + j + "ͬѧ�ķ���:>");
				studentScore = myScanner.nextDouble();
				if (i == 0){
					classOneScore += studentScore; 
				}
				if (i == 1){
					classTwoScore += studentScore;
				}
				if (i == 2){
					classThreeScore += studentScore;
				}
			}
		}
		System.out.println("һ���ƽ����Ϊ:" + classOneScore / 5);
		System.out.println("�����ƽ����Ϊ:" + classTwoScore / 5);
		System.out.println("�����ƽ����Ϊ:" + classThreeScore / 5);
		System.out.println("���а༶��ƽ����Ϊ:" + 
			(classOneScore + classTwoScore + classThreeScore) / 15);
		
		//ͳ�������༶����������ÿ������5��ͬѧ
		//
		//��ӡ�˷���
		// int row = 0;
		// int col = 0;
		// for (row = 0; row < 9; row++){
		// 	//��ӡ��
		// 	for (col = 0; col <= row; col++){
		// 		//��ӡ��
		// 		System.out.print((row + 1) + " * " + (col + 1) + "= " + ((row + 1) * (col + 1)) 
		// 							+ " " );
		// 	}
		// 	//����
		// 	System.out.print("\n");
		// }
	}
}