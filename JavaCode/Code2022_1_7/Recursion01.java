import java.util.*;
public class Recursion01 {
	public static void main(String[] args) {
		T t = new T();
		t.test(4);
		//���ֵ
		System.out.println((int)(Math.random() * 100));
		//�����ǰ����
		System.out.println(new Date());
		System.out.println(new Date().toString());
		int factorial = t.factorial(3);
		System.out.println(factorial);
	}
}
class T {
	public void test(int n) {
		if (n > 2) {
			test(n - 1);
		}
		System.out.println("n = " + n);
	}

	public int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}

// n == 4 > 2 -> test(3) 
// n == 3 > 2 -> test(2)
// n == 2 == 2 ->���n = 2
//����
//test(2) ->�����n = 2
//test(3) ->�����n = 3
//test(4) ->�����n = 4