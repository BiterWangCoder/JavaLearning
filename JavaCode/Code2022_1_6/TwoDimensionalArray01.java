
//��ά������������Բ���ͬ
//ʵ����

public class TwoDimensionalArray01 {

	public static void main(String[] args) {
		
		int[][] array;
		array = new int[3][];
		int i = 0;
		for (i = 0; i < array.length; i++) {
			//Ϊÿһ�п�����Ӧ�����Ŀռ�
			array[i] = new int[i + 1];
			int len = 0;
			for (len = 0; len < array[i].length; len++) {
				array[i][len] = i + 1;
			}
		}
		for (i = 0; i < array.length; i++) {
			int j = 0;
			for (j = 0; j < array[i].length; j++) {

				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}