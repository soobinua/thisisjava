package thisisjava.ch03.sec01;

public class SignOperatorExample {

	public static void main(String[] args) {
		// 부호 연산자
		// +피연산자; 피연산자의 부호 유지
		// -피연산자; 피연산자의 부호 변경
		// +연산자는 잘 사용되지 않고 - 연산자는 변수값의 부호를 변경할 때 사용

		int x = -100;
		x = -x;
		System.out.println("x : " + x);

		byte b = 100;
//		byte y = -b; // 컴파일 에러
		// 정수 타입(byte, short, int) 연산의 결과는 int 타입
		int y = -b; // 부호 변경하는 것도 연산이므로 int 타입 변수에 대입해야 한다.
		System.out.println("y : " + y);
	}
}