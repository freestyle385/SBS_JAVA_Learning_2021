// ĳ���� Ŭ���� ������ ���� ����, ��ü ����
// ������ ��ü�� ������ ����
// Ŭ���� ������ ���� �پ��� ���� Ÿ�� Ȱ��
// '�Ұ��ϴ�'��� ���� ������ �߻�ȭ�� �Լ� ����

package java_06_22;

public class making_class_obj_ex02 {

	public static void main(String[] args) {

		// 	��� 1 => Ÿ�� �̽���ġ�� ���� ��� �Ұ�
		//	int[] aĳ����1 = new int[5];  => �� ���������� int�� Ȱ�� ����
		//	aĳ����1[0] = 1;
		//	aĳ����1[1] = 22;
		//	aĳ����1[2] = 1241523;
		//	aĳ����1[3] = 50;
		//	aĳ����1[4] = "ȫ�浿";

		// 	��� 2 => Ŭ������ ������ Ÿ�Ե� ��� Ȱ�� ����(int�� String�� ����)
		ĳ���� aĳ���� = new ĳ����();
		aĳ����.��ȣ = 2;
		aĳ����.���� = 23;
		aĳ����.�ֹι�ȣ = 1534653;
		aĳ����.���ݷ� = 135;
		aĳ����.�̸� = "�ٰ���";
		introduce(aĳ����.��ȣ, aĳ����.����, aĳ����.�ֹι�ȣ, aĳ����.���ݷ�, aĳ����.�̸�);

	}
	static void introduce(int no, int age, int jumin, int attackP, String name) {
		//	�Ű������� �޶� �˾Ƽ� ��Ī ����
		System.out.println("ĳ���� �Ұ�====");
		System.out.printf("��ȣ : %d\n", no);
		System.out.printf("���� : %d\n", age);
		System.out.printf("�ֹι�ȣ : %d\n", jumin);
		System.out.printf("���ݷ� : %d\n", attackP);
		System.out.printf("�̸� : %s\n", name);
		
	}
}

class ĳ���� {
	int ��ȣ;
	int ����;
	int �ֹι�ȣ;
	int ���ݷ�;
	String �̸�;
}
