package reference;

public class ArrayExample2 {

	public static void main(String[] args) {
		// 1~10���� ���� ���� ����.
		// �л� 10��.
		int[] scores = new int[10];

		System.out.println(scores.length);
		for (int i = 0; i < scores.length; i++) {
			int temp = (int) (Math.random() * 10) + 1;
			scores[i] = temp;
			System.out.printf("%d�� �л� ����: %d \n", i, scores[i]);
		}
		// scores �迭Ÿ��. socres[0] intŸ��.
		System.out.println("===��1===");
		// �迭�� ��� �ִ� ��ҵ��� ��.
		int sum = 0;
		// �迭�� �հ�: 55
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.println("�迭�� ��: "+sum);
		System.out.println("===��2===");
		int sum2=0;
		for(int i=0; i<scores.length; i++) {
			if(i>5) {
				sum2+=scores[i];
			}
			
		}
		System.out.println("5���� ū ������ ��: "+sum2);
		System.out.println("===��3===");
		
		//�迭 ��� �� ¦����° ���� ��
		int sum3=0;
		for(int i=0; i<scores.length; i++) {
			if(i%2==0) {
				sum3+=scores[i];
			}
		} System.out.println("¦�� ��: "+sum3);
		System.out.println("===��4===");
	}

}
