//��ӡ�������
import java.util.Scanner;

public class TwoDimensionalArray02 {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("��������Ҫ���������ǵ�����:>");
		int n = myScanner.nextInt();
		int[][] triangleArray = new int[n][];
		int i = 0;
		int j = 0;
		for (i = 0; i < triangleArray.length; i++) {
			//ÿ����i + 1 ��Ԫ��
			triangleArray[i] = new int[i + 1];
			for (j = 0; j < triangleArray[i].length; j++) {
				//��ֵ
				if (j == 0 || j == triangleArray[i].length - 1) {
					triangleArray[i][j] = 1;
				}
				else {
					triangleArray[i][j] = triangleArray[i - 1][j - 1] + triangleArray[i - 1][j];
				}
			}
		}
		//����������
		for (i = 0; i < triangleArray.length; i++) {

			for (j = 0; j < triangleArray[i].length; j++) {
				System.out.print(triangleArray[i][j] + " ");
			}
			//����
			System.out.println();
		}
	}
}