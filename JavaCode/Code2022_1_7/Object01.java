
//ÿ������ִ�еĹ����ж��������Ӧ��һ��ջ
//��ִֹ����Ϻ��Ӧ��ջ���ͻᱻ�ͷ�

public class Object01 {

	public static void main(String[] args) {
		//��������
		Person one = new Person();
		//��ֵ
		one.name = "������";
		one.age = 18;
		//�ڴ���һ������
		Person two = new Person();
		two.name = "����ʦ";
		two.age = 40;
		//���÷���-ͨ���Լ������Ķ�����е���
		int sumAge = one.getSum(one.age, two.age);
		//������������֮��getSumջ����
		System.out.println(sumAge);
	}
}

//����һ����
class Person {
	//���������Ϣ
	String name;
	int age;
	//��ķ�����Ϣ
	public int getSum(int n, int m) {
		return n + m;
	}
}