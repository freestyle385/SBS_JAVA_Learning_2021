package java_07_07;

public class RunningMan {

	public static void main(String[] args) {
		���1 a��� = new ���1();
		a���.�޸���_�ӷ� = 20;
		a���.�޸���();
		// ����� 20km/h�� �޸��ϴ�.
		a���.�޸���();
		// ����� 20km/h�� �޸��ϴ�.

		a���.�޸���_�ӷ� = 50;
		a���.�޸���();
		// ����� 50km/h�� �޸��ϴ�.
	}

}

class ���1 {
	int �޸���_�ӷ�;
	void �޸���() {
		System.out.println("����� " + �޸���_�ӷ� + "km/h �� �޸��ϴ�.");
	}
}