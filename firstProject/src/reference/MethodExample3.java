package reference;

public class MethodExample3 {

	public static void main(String[] args) {

		int[] intAry = { 30, 40, 50, 60, 70 };
		int sum = 0;
		for (int num : intAry) {
			sum += num;
		}
		
		System.out.println("합1: " + sum);

		sum = 0;
		int[] intAry2 = { 30, 40 };
		sum = sumArray(intAry2);
		System.out.println("합2: " + sum);
		
		
	}

	// 배열을 매개변수.
	public static int sumArray(int[] intAry) {
		int sum = 0;
		for (int num : intAry) {
			sum += num;
		}
		return sum;
		
	}

	// 배열을 매개변수 -> 평균.
	public static double avgArray(int[] intAry) {
		int sum = sumArray(intAry);
		double avg = (double) sum / intAry.length;
		return avg;
	}

}
