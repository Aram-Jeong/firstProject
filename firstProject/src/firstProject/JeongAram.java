package firstProject;

import java.util.Scanner;

public class JeongAram {

	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("���� ����ð�");
		int yesterday = scn.nextInt();
		System.out.println("���� ����ð�");
	    int today = scn.nextInt();
		
		int sum = ( yesterday + today );
		int avg = sum/2;
		
		System.out.println("[���� �м�]");
		System.out.printf("����ڴ��� ��Ʋ ����ð��� �� %d�ð��̰�, ��� %d�ð��Դϴ�.", sum, avg);
		
	
		
		
	
		

	}

}
