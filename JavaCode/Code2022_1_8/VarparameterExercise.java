

public class VarParameterExercise {

	public static void main(String[] args) {

		//���������ͳɼ��ܷ�
		MyTools tools =new MyTools();
		System.out.println(tools.showScore("С��", 1, 2, 3));
	}
}

class MyTools {

	public String showScore(String str, double... score) {
		double totalScore = 0;
		int i = 0;
		for (i = 0; i < score.length; i++) {
			totalScore += score[i];
		}
		return str + "��" + score.length + "�ųɼ��ܷ�Ϊ" + totalScore;
	}
}