// ����� a���� �̶�� ������ ���� �� �ְ� ���ּ���.
package java_07_05;

public class Class_Value_exam01 {

	public static void main(String[] args) {
		��� a��� = new ���();
		a���.a���� = new ��();
		
		a���.���� = 20;
		a���.a����.���� = 30;
		
		System.out.println(a���.a����.����); // 30
	}

}

class ��� {
	// Ŭ�����ȿ� ������ ���� �� �� �ִ�.
	int ����;
	�� a����;

}

class �� extends ��� {
	int ����;
	
}