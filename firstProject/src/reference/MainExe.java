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
		for (String name : ary) {
			name = readString("�л� �̸��� �Է��ϼ���.");
		}

	}

	public static int createStudent() {
		int cnt = readInt("�л� ���� �Է��ϼ���.");
		return cnt;
	}

	public static void showList(String[] ary) {

	}

}
