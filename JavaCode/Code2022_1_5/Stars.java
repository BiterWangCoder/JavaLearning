//����Ĵ�ӡ������
//
//
import java.util.Scanner;

public class Stars{

	public static void main(String[] args){
		
		Scanner myScanner = new Scanner(System.in);
		int n = 0;
		System.out.print("��������Ҫ��ӡ������:>");
		n = myScanner.nextInt();
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++){
			//��ӡ��
			// for (j = 0; j < n + i; j++){
			// 	if (i + j == 5 || j - i == 5 || i == n - 1){
			// 		System.out.print("*");
			// 	}
			// 	else{
			// 		System.out.print(" ");
			// 	}
			// 	if (i == n - 1){
			// 		for (j = 0; j < 2 * n - 1; j++){
			// 			System.out.print("*");
			// 		}
			// 	}
			// }
			for (j = 0; j < 2 * n - 1; j++){
				if (i + j == n - 1 || j - i == n - 1 || i == n - 1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}