package java_07_01;

public class ReferenceValue_worrior_attack {

	public static void main(String[] args) {
		���� a���� = new ����();

		a����.����("����̾�", "Į");
		// ����̾���(��) Į(��)�� �����մϴ�.

		a����.�����();
		// ����̾���(��) Į(��)�� �����մϴ�.

		a����.����("�ʸ�", "â");
		// �ʸ���(��) â(��)�� �����մϴ�.

		a����.����("��ũ", "������");
		// ��ũ(��) ������(��)�� �����մϴ�.

		a����.�����();
		// ��ũ(��) ������(��)�� �����մϴ�.

		a����.�����();
		// ��ũ(��) ������(��)�� �����մϴ�.
	}

}

class ���� {
	String last_worrior_name;
	String last_attack;
	// �Ʒ� �Լ����� this�� ����ϱ� ���� ���������� ����
	// void �Լ� �ȿ��� �����غ��� ���������̹Ƿ� �Լ� ������ ���ư�����

	void ����(String worrior_name, String attack) {
		this.last_worrior_name = worrior_name;
		this.last_attack = attack;
		// ���� �Լ����� ���� ���ڵ��� this~~ ������ ���� �޾� ����
		// this ���� ����	
		System.out.printf("%s��(��) %s(��)�� �����մϴ�.\n", worrior_name, attack);
	}

	void �����() {
		System.out.printf("%s��(��) %s(��)�� �����մϴ�.\n", this.last_worrior_name, this.last_attack);
		// �� ���� �Լ����� ����� this~~ ������ ���
		// this ���� ����
	}
}