package control;

public class DoWhileExe {

	public static void main(String[] args) {
		boolean run = false;
		
		int i = 1;
		do {
			System.out.println(i);	
			i++;
		}while(i<=10);
		System.out.println("³¡1");
		
		//
		
		int n = 1;
		do {
			n++;
			if(n%2==1) {
				continue;
			}
			System.out.println(n);
			if(n>=10) {
				break;
			}
		}while(true);
		System.out.println("³¡2");
		
		
		
		
		
	}
	
	}

	
		

			
	


