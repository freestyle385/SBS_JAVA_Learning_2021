package java_practice;

import java.util.Calendar;
// Ķ���� ��� �ҷ�����

public class SwitchCase_ImportCalendar_exam01 {
	public static void main(String[] args) {
		// month���� ������ �� ������ ��� �ֽ��ϴ�.
		
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
		// getInstance()�� new ������ó�� Ŭ������ ���ο� �޸𸮿� �Ҵ��ϴ� �޼ҵ�.
		// new�� ������ : ���ʿ� �Ҵ�� �޸𸮸� ��� ����Ѵٴ� ��(�޸� �ּҰ� ����)���� �ٸ�.
		
		String season = "";
		
		// switch���� �̿��ؼ� season�� ������ � �������� ��Ÿ���� ��������.
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		}

		System.out.println("������ " + month + "���̰�, " + season + "�Դϴ�.");
	}
}