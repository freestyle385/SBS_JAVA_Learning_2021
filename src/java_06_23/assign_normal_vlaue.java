package java_06_23;

public class assign_normal_vlaue {
		// 일반변수에 값 할당하는 과정
	public static void main(String[] args) {
		// 오직 정수만 담을 수 있는 변수 x 생성
		// 초기에는 x에 쓰레기 값인 0이 들어간다. 왜냐하면 규칙상 x에 정수 아닌 값이 들어있으면 안되기 때문이다.
		// 앞에 int는 x에 정수만 들어갈 수 있다는 뜻이다.
		int x;

		// x에 기존에 저장되어 있던 쓰레기값이 사라지고 20이 들어간다(저장된다);
		x = 20;
	}
}