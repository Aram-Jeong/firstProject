package control;

public class JeongAram {

	public static void main(String[] args) {
		// if for(while) break continue
		
		int i = 1;
		int sum = 0;
		do {
			sum+=i++;
		}while(i<=100);
		System.out.println("1부터 100까지의 합: " + sum);
		
		int i2 = 1;
		int sum2 =0;
		do {
			i2++;
			if(i2%2==1) {
				continue;
			}
			sum2+=i2++;	
			if(i2%2==0) {
				break;
			}
		}while(i2<=100);
		System.out.println("1부터 100까지의 짝수 합: " + sum2);
		
	

	}

}
