package java_06_14;

class value_swap {
	public static void main(String[] args) {
		int a;
		a = 5;

		System.out.println(a);
		System.out.println(a + 10);

		int b = 10;

		System.out.println("a : " + a);
		System.out.println("b : " + b);

		int c = a;
		a = b;
		b = c;
		// �� a�� �� b�� ���Ḧ ��ü�ϱ� ���� ���ο� �� c�� �������� �� ���� 
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}