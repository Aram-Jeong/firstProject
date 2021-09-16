package reference;

public class MethodExample2 {

	public static void main(String[] args) {
		sum(24, 55); // 메소드 실행, 타입대신 값을 넣어준다.
		int a = 45, b = 77;
		sum(a, b);

		multi(12, 15);

		getArea(3.5);

		int res = getMax(a, b);
		System.out.println("큰 수는: " + res);

		System.out.println("나누기 결과는 " + divide(5, 3));

	}

	// 두 정수를 입력 받아서 두 수의 합을 출력.

	public static void sum(int n1, int n2) { // 선언하는 부분에만 타입 정의
		int sum = n1 + n2;
		System.out.println("두 수의 합: " + sum);
	}

	// 두 정수를 입력 받아서 두 수의 곱을 출력.
	public static void multi(int n3, int n4) {
		int multi = n3 * n4;
		System.out.println("두 수의 곱: " + multi);
	}

	// 정사각형 너비를 계산해주는 메소드
	public static void getArea(double side) {
		double getArea = side * side;
		System.out.println("정사각형의 너비는: " + getArea);
	}

	// 두 수 중에서 큰 값을 반환해주는 메소드.
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2) ? num1 : num2;
		return result;
	}

	// 두 정수를 입력 받아서 첫 번째 값/두 번째 값 결과 반환.
	public static double divide(int a, int b) {
		double divide = (double) a / b;
		return divide;

	}

}
