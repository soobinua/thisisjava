package thisisjava.ch03.sec07;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// 논리 연산자
		// AND 논리곱(&&), OR 논리합(||), XOR 배타적 논리합(^), NOT 논리 부정(!)
		// 논리 연산은 흐름 제어문인 조건문(if), 반복문(for, while)등에서 주로 이용
		// (피연산자1 && 피연산자2) 피연산자가 모두 true인 경우에만 연산 결과 true
		// (피연산자1 || 피연산자2) 피연산자 중 하나만 true이면 연산 결과 true
		// (피연산자1 ^ 피연산자2) 피연산자가 하나는 true이고 다른 하나가 false인 경우에만 연산 결과 true
		// (!피연산자) 피연산자의 논리값 바꿈

		int charCode = 'A';
		// int charCode = 'a';
		// int charCode = '5';

		// AND 논리곱
		if ((65 <= charCode) & (charCode <= 90)) {
			System.out.println("대문자이군요.");
		}

		if ((97 <= charCode) && (charCode <= 122)) {
			System.out.println("소문자이군요.");
		}

		if ((48 <= charCode) && (charCode <= 57)) {
			System.out.println("0~9 숫자이군요.");
		}

		// ----------------------------------------------------------

		int value = 6;
		// int value = 7;

		// OR 논리합
		if ((value % 2 == 0) | (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수이군요.");
		}

		boolean result = (value % 2 == 0) || (value % 3 == 0);
		if (!result) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}
}