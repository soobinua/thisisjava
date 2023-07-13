package thisisjava.ch04.sec03;

public class SwitchExpressionsExample {

	public static void main(String[] args) {
		// Java 12 이후부터 switch 문에서 Expressions(표현식) 사용 가능
		// break 문을 없애는 대신에 화살표와 중괄호 사용해 가독성 좋아졌다.
		char grade = 'B';

		switch (grade) {
		case 'A', 'a' -> {
			System.out.println("우수 회원입니다.");
		}
		case 'B', 'b' -> {
			System.out.println("일반 회원입니다.");
		}
		default -> {
			System.out.println("손님입니다.");
		}
		}

		switch (grade) {
		case 'A', 'a' -> System.out.println("우수 회원입니다."); // 중괄호 안에 실행문이 하나만 있을 경우 중괄호 생략 가능
		case 'B', 'b' -> System.out.println("일반 회원입니다.");
		default -> System.out.println("손님입니다.");
		}

		// SwitchCharExample 을 Switch Expressions으로 작성
	}
}