package reference;

import java.util.Scanner;

public class MainExe {

	public static void main(String[] args) {
		// 1. 학생수 지정, 2. 학생이름 입력, 3. 출력, 4. 종료
		String[] names = null;
		while (true) {
			showMenu();
			int choice = readInt("번호를 선택하세요>>");

			if (choice == 1) {
				
				
			} else if (choice == 2) {
				studentName(names);
			}else if(choice==3) {
				showList(names);
			}else if(choice==4) {
				break;
			}
		}

	}

	public static void showMenu() {
		System.out.println("1[학생 인원] 2[학생 이름] 3[목록 확인] 4[종료]");
	}

	public static int readInt(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		int menu = scn.nextInt();
		return menu;

	}

	public static String readString(String msg) {
		Scanner scn = new Scanner(System.in);
		System.out.println(msg);
		String menu = scn.nextLine();
		return menu;

	}

	public static void studentName(String[] ary) {
		for (String name : ary) {
			name = readString("학생 이름을 입력하세요.");
		}

	}

	public static int createStudent() {
		int cnt = readInt("학생 수를 입력하세요.");
		return cnt;
	}

	public static void showList(String[] ary) {

	}

}
