import java.util.Arrays;

public class BubbleSort01 {

	public static void main(String[] args) {

		//ʵ��ð�������С����
			
		int[] array = {1, 2, 3, 4, 7, 6 ,9, 10, 22, 34};

		int i = 0;
		int j = 0;
		//ȷ������
		for (i = 0; i < array.length - 1; i++) {

			//ȷ��һ�˽��бȽϵĴ���
			for (j = 0; j < array.length - 1 - i; j++) {

				//ʵ�ֽ�����ת�������
				if (array[j] > array[j + 1]) {
					//����
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		
		
		int i = 0;
		Arrays.sort(array);
		//���
		for (i = 0; i < array.length; i++) { 
			System.out.print(array[i] + " ");
		}

	}
}