package java_07_01;

public class ReferenceValue_worrior_attack {

	public static void main(String[] args) {
		전사 a전사 = new 전사();

		a전사.공격("브라이언", "칼");
		// 브라이언이(가) 칼(으)로 공격합니다.

		a전사.재공격();
		// 브라이언이(가) 칼(으)로 공격합니다.

		a전사.공격("필립", "창");
		// 필립이(가) 창(으)로 공격합니다.

		a전사.공격("마크", "지팡이");
		// 마크(가) 지팡이(으)로 공격합니다.

		a전사.재공격();
		// 마크(가) 지팡이(으)로 공격합니다.

		a전사.재공격();
		// 마크(가) 지팡이(으)로 공격합니다.
	}

}

class 전사 {
	String last_worrior_name;
	String last_attack;
	// 아래 함수에서 this를 사용하기 위해 전역변수로 설정
	// void 함수 안에서 설정해봤자 지역변수이므로 함수 끝나고 날아가버림

	void 공격(String worrior_name, String attack) {
		this.last_worrior_name = worrior_name;
		this.last_attack = attack;
		// 공격 함수에서 받은 인자들을 this~~ 변수로 각각 받아 저장
		// this 생략 가능	
		System.out.printf("%s이(가) %s(으)로 공격합니다.\n", worrior_name, attack);
	}

	void 재공격() {
		System.out.printf("%s이(가) %s(으)로 공격합니다.\n", this.last_worrior_name, this.last_attack);
		// 위 공격 함수에서 저장된 this~~ 변수로 출력
		// this 생략 가능
	}
}