package reference;

public class MethodExample2 {

	public static void main(String[] args) {
		sum(24, 55); // �޼ҵ� ����, Ÿ�Դ�� ���� �־��ش�.
		int a = 45, b = 77;
		sum(a, b);

		multi(12, 15);

		getArea(3.5);

		int res = getMax(a, b);
		System.out.println("ū ����: " + res);

		System.out.println("������ ����� " + divide(5, 3));

	}

	// �� ������ �Է� �޾Ƽ� �� ���� ���� ���.

	public static void sum(int n1, int n2) { // �����ϴ� �κп��� Ÿ�� ����
		int sum = n1 + n2;
		System.out.println("�� ���� ��: " + sum);
	}

	// �� ������ �Է� �޾Ƽ� �� ���� ���� ���.
	public static void multi(int n3, int n4) {
		int multi = n3 * n4;
		System.out.println("�� ���� ��: " + multi);
	}

	// ���簢�� �ʺ� ������ִ� �޼ҵ�
	public static void getArea(double side) {
		double getArea = side * side;
		System.out.println("���簢���� �ʺ��: " + getArea);
	}

	// �� �� �߿��� ū ���� ��ȯ���ִ� �޼ҵ�.
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2;
		return result;
	}

	// �� ������ �Է� �޾Ƽ� ù ��° ��/�� ��° �� ��� ��ȯ.
	public static double divide(int a, int b) {
		double divide = (double) a / b;
		return divide;

	}

}
