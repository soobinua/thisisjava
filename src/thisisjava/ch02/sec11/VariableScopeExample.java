package thisisjava.ch02.sec11;

public class VariableScopeExample {

	public static void main(String[] args) {
		// 변수 사용 범위
		// 메소드 블록 전체에서 사용하고 싶다면 메소드 블록 첫머리에 선언하는 것이 좋다.
		// 특정 블록 내부에서만 사용된다면 해당 블록 내에서 선언하는 것이 좋다.
		int v1 = 15;
		if (v1 > 10) {
			// 중괄호 {} 블록 내에서 선언된 변수는 해당 중괄호 {} 블록 내에서만 사용 가능
			int v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5; // v2 변수를 사용할 수 없기 때문에 컴파일 에러 발생
	}
}