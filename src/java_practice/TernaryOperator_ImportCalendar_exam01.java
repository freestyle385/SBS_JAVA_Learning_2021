package java_practice;

import java.util.Calendar;

public class TernaryOperator_ImportCalendar_exam01 {
	public static void main(String[] args) {
		// hour���� ���� �ð��� 24�ð� ������ ��� �ֽ��ϴ�.
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		String ampm;
		// ���׿����ڸ� �̿��ؼ� ampm�� ���� "����" �Ǵ� "����"�� ��������.
		ampm = hour < 12 ? "����" : "����";
		// ���� = ���ǽ� ? �ǿ�����1 : �ǿ�����2
		// ���ǽ��� true�̸� �ǿ�����1��, ���ǽ��� false�� �ǿ�����2�� ����
		
		System.out.println("���ݽð��� " + hour + "���̰�, " + ampm + "�Դϴ�.");
	}
}