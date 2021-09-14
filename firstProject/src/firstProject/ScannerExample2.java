package firstProject;

import java.util.Scanner;

public class ScannerExample2 {

	public static void main(String[] args) {
		// 변수: 사용자 입력(10, 20)
		// 10 + 20 = 30
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("첫 번째 값을 입력하세요.");
		int n1 = scn.nextInt();
		System.out.println("두 번째 값을 입력하세요.");
		int n2 = scn.nextInt();
		
		System.out.printf("합계: %d", n1 + n2 );
		
		

	}

}
