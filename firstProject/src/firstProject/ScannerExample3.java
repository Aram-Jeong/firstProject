package firstProject;

import java.util.Scanner;

public class ScannerExample3 {

	public static void main(String[] args) {
		int num;
		Scanner scn = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		int Eng = scn.nextInt();
		System.out.println("���� ������ �Է��ϼ���");
		int Math = scn.nextInt();
		System.out.println("�̸��� �Է��ϼ���");
		String name = scn.nextLine();
		
		int sum = (Eng + Math);
		int avg = sum/2;
		
		System.out.println("[���]");
		System.out.printf("%s���� ���� ���� %d, ����� %d�Դϴ�.", name, sum, avg);
		
		if(avg>60);
		System.out.println(" �հ��Դϴ�.");
		
			
		}
		
		

	}

