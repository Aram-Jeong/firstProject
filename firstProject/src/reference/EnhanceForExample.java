package reference;

public class EnhanceForExample {

	public static void main(String[] args) {
		String[] strAry = null; // 참고할 name 없음
		strAry = new String[5]; // null, null, null, null, null 크기만 5개 생김
		strAry = new String[] { "Hong", "Park", "Choi", "Kim", "Hwang" };
		System.out.println(strAry.length);

		strAry[2] = "Hong"; // ==, equals()

		for (int i = 0; i < strAry.length; i++) {
			if (strAry[i].equals("Hong"))
				System.out.println(strAry[i]);
		}
		System.out.println("===다시===");
		// Enhanced for 확장. 배열에 있는 만큼 반복
		for (String name : strAry) {
			System.out.println(name);
		}

		int[] scores = { 50, 70, 80, 60 };
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}
		System.out.println("===합계: " + sum);
		// 학생 3명 4.2, 3.5, 2.8

		double[] points = { 4.2, 3.5, 2.8, 3.7 };
		double sum2 = 0;
		double avg = 0;
		for (double point : points) {
			sum2 += point;
			avg = sum2 / points.length;
		}
		System.out.println("합계: " + sum2);
		System.out.println("평균: " + avg);
	}

}
