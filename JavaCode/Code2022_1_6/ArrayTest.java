import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		int n = 0;
		Scanner myScanner = new Scanner(System.in);

		System.out.print("��������Ҫ�����������С:>");
		n = myScanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}
	}
}