package thisisjava.ch05.sec05;

public class EqualsExample {
	public static void main(String[] args) {
		// 문자열(String) 타입
		String strVar1 = "홍길동"; // String 타입 변수 선언 후 문자열 대입
		String strVar2 = "홍길동";

		if (strVar1 == strVar2) { // 자바 문자열 리터럴이 동일하다면 String 객체를 공유. 동일한 String 객체의 번지 저장
			System.out.println("strVar1과 strVar2는 참조가 같다.");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다르다.");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같다.");
		}

		String strVar3 = new String("홍길동"); // new 연산자로 직접 String 객체를 생성하고 대입할 수도 있다.
		String strVar4 = new String("홍길동"); // new 연산자는 새로운 객체를 만드는 연산자로 객체 생성 연산자라고 한다.

		if (strVar3 == strVar4) { // new 연산자를 이용한 경우 서로 다른 String 객체의 번지를 가진다.
			System.out.println("strVar3과 strVar4는 참조가 같다.");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다르다.");
		}

		if (strVar3.equals(strVar4)) { // equals() 동일한 String 객체든 다른 String 객체든 상관없이 내부 문자열만을 비교. 대소문자 구분
			System.out.println("strVar3과 strVar4는 문자열이 같다.");
		}
	}
}
