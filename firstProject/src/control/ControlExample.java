package control;

public class ControlExample {

	public static void main(String[] args) {
		String inputValue = "A";
		
		switch(inputValue) {
		case "A":
			System.out.println("�� ���߾��!");
			break;
		case "B":
			System.out.println("���߾��!");
			break;
		case "C":
			System.out.println("�����̿���.");
			break;
		case "D":
			System.out.println("����ϼ���.");
			break;
		default:
			System.out.println("�Ǹ��̿���.");
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
