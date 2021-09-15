package control;

public class ConditionExe {

	public static void main(String[] args) {
		int num1 = 60;
		int num2 = 70;
		int result = num1 + num2;
		
		if( result>=100) {
			System.out.println("합격");
		} else { 
			System.out.println("불합격");
		}
		
		if( num1*num2%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		int num3 = 12;
		if(num3%2==0) {
			System.out.println("2의 배수");
		} else if(num3%3==0) {
			System.out.println("3의 배수");
		} else if(num3%2==0 && num3%3==0) {
			System.out.println("2와 3의 배수");
		}
		
		System.out.println("끝");
		
		
		int randomValue =(int) (Math.random() *6) +1;
		System.out.println(randomValue);
		
		// switch조건문 -> 1이 나왔습니다.
		// 4번 끝.
	
		switch (randomValue) {
		case 1:
			System.out.println("1이 나왔습니다.");
			break;
		case 2:
			System.out.println("2가 나왔습니다.");
			break;
		case 3:
			System.out.println("3이 나왔습니다.");
			break;
		case 4:
			System.out.println("4가 나왔습니다.");
			break;
		case 5:
			System.out.println("5가 나왔습니다.");
			break;
		case 6:
			System.out.println("6이 나왔습니다.");
			break;
		}	
			System.out.println("4번 끝");
			
			int randomScore = (int)(Math.random() *99);
			if(randomScore>=90) {
				System.out.println("A학점");
			}else if(randomScore>=80) {
				System.out.println("B학점");
			}else if(randomScore>=70) {
				System.out.println("C학점");
			}else if(randomScore>=60) {
				System.out.println("D학점");
			}else {
				System.out.println("F학점");
				
				
	
			}
		}
			
		}

			




