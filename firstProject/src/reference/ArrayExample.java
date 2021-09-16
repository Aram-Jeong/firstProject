package reference;

public class ArrayExample {
	public static void main(String[] args) {
		// 학생 30명
		// int s1 ~ s30;
		// int num, String str;
		int a1, a2, a3;
		int[] intAry = { 1, 2, 3, 4, 5 };

		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);

		System.out.println("====다시====");

// 		intAry = 10; <-정수값을 바로 담을 수 없음		
		intAry[0] = 6;
		intAry[1] = 7;
		intAry[2] = 8;
		intAry[3] = 9;
		intAry[4] = 10;
		for (int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
		}

		byte[] byteAry = { 1, 2, 3 };
		for (int i = 0; i < 3; i++) {
			System.out.println("byte배열: " + byteAry[i]);
		}

		String[] strAry = { "Hello", "World", "Nice" };
		strAry = new String[] { "Hong", "Kim", "Park" };
		for(int i=0; i<3; i++) {
			System.out.println("String배열: "+strAry[i]);
		}

		double[] dblAry;
		dblAry = new double[] { 1, 2.3, 5 };
		
		}
		
		
	}


