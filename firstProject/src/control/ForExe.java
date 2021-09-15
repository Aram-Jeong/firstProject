package control;

public class ForExe {

	public static void main(String[] args) {
		System.out.println("===1번===");
		int tempValue = 0;
		for(int i=1; i<= 10; i++) {
			tempValue += (int)(Math.random()*10) +1;
			System.out.printf("%d번째 값: %d\n", i, tempValue);
		}	
		System.out.println("끝1");
		
		System.out.println("===2번===");
		for(int i=2; i <= 10; i+=2) {
			tempValue += (int)(Math.random()*10) +1;
			System.out.printf("%d번째 값: %d\n", i, tempValue);
		}
		System.out.println("끝2");
		
		System.out.println("===3번===");
		for(int i=1; i <= 10; i+=2) {
			tempValue += (int)(Math.random()*10) +1;
			System.out.printf("%d번째 값: %d\n", i, tempValue);
		}
		System.out.println("끝3");
		
		System.out.println("===4번===");
		int cnt = 0;
		for(int i=1; i<=10; i++) {
			cnt += i;
			System.out.printf("합계: %d\n", cnt);
		}
		System.out.println("끝4");
		
		

		
		
	}

}
