

public class VarParameter01 {

	public static void main(String[] args) {

		Methods tools = new Methods();
		System.out.println(tools.sum(1, 2, 3, 5));
		//�ɱ������ʵ�ο���������
		int arr[] = {1, 2, 3};
		System.out.println(tools.sum(arr));
		//�ɱ�������Ժ���ͨ���͵Ĳ���һ����ڲ����б�������������
		//һ���β��б�ֻ�ܴ���һ���ɱ����
	}
}

class Methods {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	//�ɱ��������
	public int sum(int... nums) {
		int i = 0;
		int res = 0;
		for (i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
	//error
	// public void m(int... nums, double... numss) {
	// 	//
	// }
}