package thisisjava.ch04.sec02;

public class IfElseExample {

	public static void main(String[] args) {
		// if-else문
		// if문의 조건식이 true이면 if문 블록 실행되고 false이면 else블록 실행
		int score = 85;

		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else { // score < 90일 경우
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		// 두 개의 if문 이용했던 것을 if-else문으로 처리
	}
}
