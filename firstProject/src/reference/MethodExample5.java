package reference;

public class MethodExample5 {

	public static void main(String[] args) {
		int[] scores = { 88, 67, 92, 73, 58 };
		
		int minVal=0;
		minVal=getMinVal(scores);

		System.out.println("�ּڰ���: " + minVal);

	}

	public static int getMinVal(int[] min) {
		int minVal = 0;
		boolean isTrue = false;
		for (int i = 0; i < min.length; i++) {
			isTrue = minVal > min[i];
			if (isTrue) {
				minVal = min[i];
			}
		}
		return minVal;
	}
// �ٽ� �غ���
}
