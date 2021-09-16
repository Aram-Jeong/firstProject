package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1~10까지 임의 수를 생성.
		// 학생 10명.
		int[] scores = new int[10];

		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) (Math.random() * 10) + 1;
			scores[i] = temp;
			System.out.printf("%d번 학생 점수: %d \n", i, scores[i]);
		}
		// scores 배열타입. socres[0] int타입.
		System.out.println("===끝1===");
		// 배열에 들어 있는 요소들의 합.
		int sum = 0;
		// 배열의 합계: 55
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.println("배열의 합: "+sum);
		System.out.println("===끝2===");
		int sum2=0;
		for(int i=0; i<scores.length; i++) {
			if(i>5) {
				sum2+=scores[i];
			}
			
		}
		System.out.println("5보다 큰 값들의 합: "+sum2);
		System.out.println("===끝3===");
		
		//배열 요소 중 짝수번째 값만 합
		int sum3=0;
		for(int i=0; i<scores.length; i++) {
			if(i%2==0) {
				sum3+=scores[i];
			}
		} System.out.println("짝수 합: "+sum3);
		System.out.println("===끝4===");
	}

}
