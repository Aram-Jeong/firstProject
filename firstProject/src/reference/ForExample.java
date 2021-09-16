
package reference;

public class ForExample {

	public static void main(String[] args) {
		
		{
			int j=0;
			int i=0;
		}
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("===끝1===");

		// 1~10 짝수만 출력..

		for (int n = 1; n <= 10; n++) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}
		System.out.println("===끝2===");

		// 1~10 홀수만 합
		int sum = 0;
		for (int h = 1; h <= 10; h++) {
			if (h % 2 == 1) {
				sum += h;
			}
		}
		System.out.println("합계: " + sum);
		System.out.println("===끝3===");

		sum = 0;
		int cnt =1;
		// 1~10 sum의 값이 20을 넘어서는 그때의 횟수
		for (int a = 1; a <= 10; a++) {
			sum += a;
			if (sum >= 20) {
				cnt=a;
				break;
			}
			System.out.println("횟수: " + cnt);
		}
		System.out.println("===끝4===");
	}

}
