package reference;

import java.util.Scanner;

public class MainExe {

	public static void main(String[] args) {
		// 1. �л��� ����, 2. �л��̸� �Է�, 3. ���, 4. ����
		String[] names = null;
		while (true) {
			showMenu();
			int choice = readInt("��ȣ�� �����ϼ���>>");

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
		System.out.println("1[�л� �ο�] 2[�л� �̸�] 3[��� Ȯ��] 4[����]");
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
			System.out.println("������� �������ּ���.");
			return;
			
		
		}
		for (int i=0; i<ary.length; i++) {
			ary[i] = readString("�л� �̸��� �Է��ϼ���.");
		}

	}

	public static int createStudent() {
		int cnt = readInt("�л� ���� �Է��ϼ���.");
		return cnt;
	}

	public static void showList(String[] ary) {
		if(ary==null) {
			System.out.println("������� �������ּ���.");
			return;
	}
		for(int i=0; i<ary.length; i++) {
			System.out.printf("%d�� �л���: %s\n", i+1, ary[i]);
		}

	}
	public static void quitMenu() {
		System.out.println("����Ǿ����ϴ�.");
	}
		

}
