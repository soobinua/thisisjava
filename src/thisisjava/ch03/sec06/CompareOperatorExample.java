package thisisjava.ch03.sec06;

public class CompareOperatorExample {

	public static void main(String[] args) {
		// 비교 연산자
		// 동등(==, !=) 또는 크기(<, <=, >, >=)를 평가해 boolean 타입인 true/false 산출
		// 비교 연산자는 흐름 제어문인 조건문(if), 반복문(for, while)에서 실행 흐름을 제어할 때 주로 사용
		// (피연산자1 == 피연산자2) 두 피연산자의 값이 같은지 검사
		// (피연산자1 != 피연산자2) 두 피연산자의 값이 다른지 검사
		// (피연산자1 > 피연산자2) 피연산자1이 큰지를 검사
		// (피연산자1 >= 피연산자2) 피연산자1이 크거나 같은지를 검사
		// (피연산자1 < 피연산자2) 피연산자1이 작은지를 검사
		// (피연산자1 <= 피연산자2) 피연산자1이 작거나 같은지를 검사
		// 피연산자의 타입이 다를 경우 비교 연산을 수행하기 전에 타입을 일치시킨다.
		// 한 가지 예외. 0.1f == 0.1에서 0.1f가 double 타입으로 변환되면
		// 0.1 == 0.1이 되어 true가 산출되어야 하나 결과값 false
		// 이유. 부동 소수점 방식을 사용하는 실수 타입은 0.1을 정확히 표현할 수 없을뿐만 아니라 float, double 타입의 정밀도 차이
		// 해결책. 피연산자를 float타입으로 강제 타입 변환 후 비교 연산 진행
		// 문자열 비교할 때는 동등(==, !=) 연산자 대신 equals(), !equals() 사용

		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);

		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2); // 65 < 66
		System.out.println("result4: " + result4);

		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5: " + result5);

		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float) num6);
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);

		String str1 = "자바";
		String str2 = "Java";
		boolean result8 = (str1.equals(str2)); // 문자열이 같은지 검사(대소문자 구분)
		boolean result9 = (!str1.equals(str2)); // 문자열이 다른지 검사
		System.out.println("result8: " + result8);
		System.out.println("result9: " + result9);
	}
}