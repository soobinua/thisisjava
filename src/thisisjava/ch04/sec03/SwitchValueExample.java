package thisisjava.ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		String grade = "B";

		// Java 11 이전 문법
		int score1 = 0;
		switch (grade) {
		case "A":
			score1 = 100;
			break;
		case "B":
			int result = 100 - 20;
			score1 = result;
			break;
		default:
			score1 = 60;
		}
		System.out.println("score1 : " + score1);

		// Java 12부터 switch 문에서 Expressions(표현식) 사용 가능
		// Switch Expressions 사용하면 스위치된 값 변수에 바로 대입할 수 있다.
		// 이 경우 default 반드시 존재
		int score2 = switch (grade) {
		case "A" -> 100; // 단일 값일 경우 화살표 오른쪽에 값 기술
		case "B" -> {
			int result = 100 - 20;
			// Java 13부터 가능
			// 중괄호 사용할 경우 yield 키워드로 값 지정
			yield result;
		}
		default -> 60; // 스위치된 값 변수에 바로 대입 시 default 반드시 존재해야 한다.
		};
		System.out.println("score2 : " + score2);
	}
}