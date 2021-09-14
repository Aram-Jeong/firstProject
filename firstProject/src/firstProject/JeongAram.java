package firstProject;

import java.util.Scanner;

public class JeongAram {

	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("어제 수면시간");
		int yesterday = scn.nextInt();
		System.out.println("오늘 수면시간");
	    int today = scn.nextInt();
		
		int sum = ( yesterday + today );
		int avg = sum/2;
		
		System.out.println("[수면 분석]");
		System.out.printf("사용자님의 이틀 수면시간은 총 %d시간이고, 평균 %d시간입니다.", sum, avg);
		
	
		
		
	
		

	}

}
