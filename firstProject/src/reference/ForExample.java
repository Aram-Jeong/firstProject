
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
		System.out.println("===��1===");

		// 1~10 ¦���� ���..

		for (int n = 1; n <= 10; n++) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}
		System.out.println("===��2===");

		// 1~10 Ȧ���� ��
		int sum = 0;
		for (int h = 1; h <= 10; h++) {
			if (h % 2 == 1) {
				sum += h;
			}
		}
		System.out.println("�հ�: " + sum);
		System.out.println("===��3===");

		sum = 0;
		int cnt =1;
		// 1~10 sum�� ���� 20�� �Ѿ�� �׶��� Ƚ��
		for (int a = 1; a <= 10; a++) {
			sum += a;
			if (sum >= 20) {
				cnt=a;
				break;
			}
			System.out.println("Ƚ��: " + cnt);
		}
		System.out.println("===��4===");
	}

}
