package java_07_06;

public class For_list_exam01 {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;

		// �迭 ����
		int[] all = new int[] { n1, n2, n3 };

		System.out.println("== �Ϲ� �ݺ� ==");
		for (int i = 0; i < all.length; i++) {
			System.out.println(all[i]);
		}

		System.out.println("== ���� �ݺ� ==");
		for (int n : all) {
			System.out.println(n);
		}
	}

}
