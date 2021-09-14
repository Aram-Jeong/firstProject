package firstProject;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("영어 점수를 입력하세요");
		int Eng = scn.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int Math = scn.nextInt();
		System.out.println("이름을 입력하세요");
		String name = scn.nextLine();
		
		int sum = (Eng + Math);
		int avg = sum/2;
		
		System.out.println("[결과]");
		System.out.printf("%s님의 점수 합은 %d, 평균은 %d입니다.", name, sum, avg);
		
		if(avg>60);
		System.out.println(" 합격입니다.");
		
			
		}
		
		

	}

