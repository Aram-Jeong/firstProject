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
				int size = createStudent();
				names = new String[size];
			} else if (choice == 2) {
				studentName(names);
			} else if (choice == 3) {
				showList(names);
			} else if (choice == 4) {
				quitMenu();
				break;
				
				
			}
		}

	}

	public static void showMenu() {
		System.out.println("===MENU===");
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
		if(ary==null) {
			System.out.println("순서대로 진행해주세요.");
			return;
			
		
		}
		for (int i=0; i<ary.length; i++) {
			ary[i] = readString("학생 이름을 입력하세요.");
		}

	}

	public static int createStudent() {
		int cnt = readInt("학생 수를 입력하세요.");
		return cnt;
	}

	public static void showList(String[] ary) {
		if(ary==null) {
			System.out.println("순서대로 진행해주세요.");
			return;
	}
		for(int i=0; i<ary.length; i++) {
			System.out.printf("%d번 학생명: %s\n", i+1, ary[i]);
		}

	}
	public static void quitMenu() {
		System.out.println("종료되었습니다.");
	}
		

}
