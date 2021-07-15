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
		// 컵 a와 컵 b의 음료를 교체하기 위해 새로운 컵 c를 가져오는 것 연상 
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}