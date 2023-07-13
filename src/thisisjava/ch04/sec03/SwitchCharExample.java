package thisisjava.ch04.sec03;

public class SwitchCharExample {

	public static void main(String[] args) {
		// swtich 문
		// 괄호에는 정수 타입(byte, short, int, long)과 문자열 타입(String) 변수를 사용할 수 있다.
		char grade = 'B';

		switch (grade) { // 영어 대소문자 관계없이 똑같이 처리
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}
	}
}