package java_practice;

public class ForEach_exam01 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 6, 7 };
		
		// for���� �̿��ؼ� array�� ���� �� �پ� ����ϼ���	
		// for (int i = 0 ; i < array.length; i++) {
		// 	int value = array[i];
		// 	System.out.println(value);
		// }

		// for each���� �̿��ؼ� array�� ���� �� �پ� ����ϼ���
		for (int value : array) {
			System.out.println(value);
		}

	}

}
