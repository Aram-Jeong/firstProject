package control;

public class ConditionExe {

	public static void main(String[] args) {
		int num1 = 60;
		int num2 = 70;
		int result = num1 + num2;
		
		if( result>=100) {
			System.out.println("�հ�");
		} else { 
			System.out.println("���հ�");
		}
		
		if( num1*num2%2==0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		int num3 = 12;
		if(num3%2==0) {
			System.out.println("2�� ���");
		} else if(num3%3==0) {
			System.out.println("3�� ���");
		} else if(num3%2==0 && num3%3==0) {
			System.out.println("2�� 3�� ���");
		}
		
		System.out.println("��");
		
		
		int randomValue =(int) (Math.random() *6) +1;
		System.out.println(randomValue);
		
		// switch���ǹ� -> 1�� ���Խ��ϴ�.
		// 4�� ��.
	
		switch (randomValue) {
		case 1:
			System.out.println("1�� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("2�� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3�� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4�� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5�� ���Խ��ϴ�.");
			break;
		case 6:
			System.out.println("6�� ���Խ��ϴ�.");
			break;
		}	
			System.out.println("4�� ��");
			
			int randomScore = (int)(Math.random() *99);
			if(randomScore>=90) {
				System.out.println("A����");
			}else if(randomScore>=80) {
				System.out.println("B����");
			}else if(randomScore>=70) {
				System.out.println("C����");
			}else if(randomScore>=60) {
				System.out.println("D����");
			}else {
				System.out.println("F����");
				
				
	
			}
		}
			
		}

			




