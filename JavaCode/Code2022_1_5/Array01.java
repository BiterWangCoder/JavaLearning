
public class Array01 {

	public static void main(String[] args) {

		//������һ������
		char[] array;
		array = new char[26];
		int index = 0;
		char ch = 'A';
		for (index = 0; index < array.length; index++) {

			array[index] =(char)(ch + index);
			System.out.print(array[index] + " ");
		}

	}
}