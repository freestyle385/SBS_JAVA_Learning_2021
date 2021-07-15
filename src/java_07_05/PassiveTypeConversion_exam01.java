// 정수 i가 가지고 있는 10을 double 형 변수에 넣고 해당 변수의 값을 다시 i에 넣기
package java_07_05;

public class PassiveTypeConversion_exam01 {

	public static void main(String[] args) {
		int i = 10;
	    double d = i; // 여기선 자동형변환 허용
	    i = (int) d; // 여기선 자동형변환 불가능 => 수동변환
	    
	    System.out.println(i);
	}

}
