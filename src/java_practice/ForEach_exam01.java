package java_practice;

public class ForEach_exam01 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 6, 7 };
		
		// for문을 이용해서 array의 값을 한 줄씩 출력하세요	
		// for (int i = 0 ; i < array.length; i++) {
		// 	int value = array[i];
		// 	System.out.println(value);
		// }

		// for each문을 이용해서 array의 값을 한 줄씩 출력하세요
		for (int value : array) {
			System.out.println(value);
		}

	}

}
