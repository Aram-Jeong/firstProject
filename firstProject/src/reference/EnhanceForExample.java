package reference;

public class EnhanceForExample {

	public static void main(String[] args) {
		String[] strAry = null; // ������ name ����
		strAry = new String[5]; // null, null, null, null, null ũ�⸸ 5�� ����
		strAry = new String[] { "Hong", "Park", "Choi", "Kim", "Hwang" };
		System.out.println(strAry.length);

		strAry[2] = "Hong"; // ==, equals()

		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i].equals("Hong"))
				System.out.println(strAry[i]);
		}
		System.out.println("===�ٽ�===");
		// Enhanced for Ȯ��. �迭�� �ִ� ��ŭ �ݺ�
		for (String name : strAry) {
			System.out.println(name);
		}

		int[] scores = { 50, 70, 80, 60 };
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("===�հ�: " + sum);
		// �л� 3�� 4.2, 3.5, 2.8

		double[] points = { 4.2, 3.5, 2.8, 3.7 };
		double sum2 = 0;
		double avg = 0;
		for (double point : points) {
			sum2 += point;
			avg = sum2 / points.length;
		}
		System.out.println("�հ�: " + sum2);
		System.out.println("���: " + avg);
	}

}
