package control;

public class ForExe {

	public static void main(String[] args) {
		System.out.println("===1��===");
		int tempValue = 0;
		for(int i=1; i<= 10; i++) {
			tempValue += (int)(Math.random()*10) +1;
			System.out.printf("%d��° ��: %d\n", i, tempValue);
		}	
		System.out.println("��1");
		
		System.out.println("===2��===");
		for(int i=2; i <= 10; i+=2) {
			tempValue += (int)(Math.random()*10) +1;
			System.out.printf("%d��° ��: %d\n", i, tempValue);
		}
		System.out.println("��2");
		
		System.out.println("===3��===");
		for(int i=1; i <= 10; i+=2) {
			tempValue += (int)(Math.random()*10) +1;
			System.out.printf("%d��° ��: %d\n", i, tempValue);
		}
		System.out.println("��3");
		
		System.out.println("===4��===");
		int cnt = 0;
		for(int i=1; i<=10; i++) {
			cnt += i;
			System.out.printf("�հ�: %d\n", cnt);
		}
		System.out.println("��4");
		
		

		
		
	}

}
