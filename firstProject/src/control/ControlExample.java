package control;

public class ControlExample {

	public static void main(String[] args) {
		String inputValue = "A";
		
		switch(inputValue) {
		case "A":
			System.out.println("참 잘했어요!");
			break;
		case "B":
			System.out.println("잘했어요!");
			break;
		case "C":
			System.out.println("보통이에요.");
			break;
		case "D":
			System.out.println("노력하세요.");
			break;
		default:
			System.out.println("실망이에요.");
		}
		
		//
		switch(inputValue) {
		case "A":
		case "B":	
		case "C":
			System.out.println("Pass");
			break;
		case "D":
			System.out.println("Retry");
			break;
		default:
			System.out.println("Fail");
		}

	}

}
