// 자동차 클래스 생성에 따른 변수, 객체 생성
// 변수와 객체의 리모콘 개념
// '달리다'라는 동사 개념을 추상화한 함수 생성

package java_06_22;

public class making_class_obj_ex01 {

	public static void main(String[] args) {
		자동차 a자동차1 = new 자동차();
		자동차 b자동차2 = new 자동차();
		
		a자동차1.최고속력 = 250;
		b자동차2.최고속력 = 340;
		
		System.out.printf("a자동차1의 최고속력 : %d\n", a자동차1.최고속력);
		System.out.printf("b자동차2의 최고속력 : %d\n", b자동차2.최고속력);
		
		a자동차1.달리다();
		b자동차2.달리다();
		
		a자동차1.서다();
		b자동차2.서다();
	}

}

class 자동차{
	int 최고속력;
	int 연식;
	void 달리다() {
		System.out.println("달립니다.");
	}
	void 서다() {
		System.out.println("섭니다.");
	}
}