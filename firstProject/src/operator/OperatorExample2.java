package operator;

public class OperatorExample2 {

	public static void main(String[] args) {
		int num1, num2, result;
		num1 = num2 = 10;
		
		result = num1 + num2;
		
		result = result + 10;
		result += 10;
		
		result -= 10; // result = result - 10;
		result *= 10;
		result /= 10;
		result %= 10;
		
		String str = "Hello";
		str = str + "World";
		str += " welcome";
		System.out.println(str);
		
		// 3�� ������
		int score = 80;
		boolean pass = (score > 60) ? true : false;
		String isok = (score > 60) ? "pass" : "Fail";
	}

}
